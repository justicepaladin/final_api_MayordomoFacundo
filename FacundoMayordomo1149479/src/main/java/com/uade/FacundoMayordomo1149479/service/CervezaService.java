package com.uade.FacundoMayordomo1149479.service;

import com.uade.FacundoMayordomo1149479.controller.DTOs.CervezaDTO;
import com.uade.FacundoMayordomo1149479.controller.DTOs.CreateCervezaDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import com.uade.FacundoMayordomo1149479.model.Estilo;
import com.uade.FacundoMayordomo1149479.model.Proveedor;
import com.uade.FacundoMayordomo1149479.repository.CervezaRepository;
import com.uade.FacundoMayordomo1149479.repository.EstiloRepository;
import com.uade.FacundoMayordomo1149479.repository.ProveedorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.InstanceAlreadyExistsException;
import java.util.List;
import java.util.Optional;

@Service
public class CervezaService {





    private final CervezaRepository cervezaRepository;

    private final EstiloRepository estiloRepository;

    private final ProveedorRepository proveedorRepository;

    public CervezaService(CervezaRepository cervezaRepository, EstiloRepository estiloRepository, ProveedorRepository proveedorRepository) {
         this.cervezaRepository = cervezaRepository;
        this.estiloRepository = estiloRepository;
        this.proveedorRepository = proveedorRepository;
    }

     public List<CervezaDTO> getAllCervezas() {
         List<Cerveza> cervezas = cervezaRepository.findAll();

         return cervezas.stream().map(this::CervezaEntity2CervezaDTO).toList();

    }

    public List<CervezaDTO> getCervezaByEstiloId(Long id) {
        List<Cerveza> cervezas = cervezaRepository.findCervezaByEstilo_Id(id).orElseThrow();

        return cervezas.stream().map(this::CervezaEntity2CervezaDTO).toList();
    }


    public CervezaDTO createCerveza(CreateCervezaDTO createCervezaDTO) throws InstanceAlreadyExistsException {
        System.out.println(createCervezaDTO.toString());
        Optional<Estilo> estiloOptional = estiloRepository.findById(createCervezaDTO.estilo_id());
        Optional<Proveedor> proveedorOptional = proveedorRepository.findById(createCervezaDTO.proveedor_id());

        if (estiloOptional.isPresent() && proveedorOptional.isPresent()) {
            Optional<Cerveza> vieja = cervezaRepository.findCervezaByNombreAndEstiloId(createCervezaDTO.nombre(), createCervezaDTO.estilo_id());
            if (vieja.isEmpty()) {
                Cerveza nuevaCerveza = Cerveza.builder().estilo(estiloOptional.get()).precio(createCervezaDTO.precio()).proveedor(proveedorOptional.get()).nombre(createCervezaDTO.nombre()).porcentajeAlcohol(createCervezaDTO.porcentajeAlcohol()).build();
                Cerveza created = cervezaRepository.save(nuevaCerveza);
                return this.CervezaEntity2CervezaDTO(created);
            }
            throw new InstanceAlreadyExistsException();
        }
        else {
            throw new EntityNotFoundException();
        }

    }



    private CervezaDTO CervezaEntity2CervezaDTO(Cerveza cerveza){
        return new CervezaDTO(cerveza.getId(), cerveza.getNombre(), cerveza.getPrecio());
    }

}
