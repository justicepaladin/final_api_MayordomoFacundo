package com.uade.FacundoMayordomo1149479.service;

import com.uade.FacundoMayordomo1149479.controller.DTOs.CreateProveedorDTO;
import com.uade.FacundoMayordomo1149479.controller.DTOs.ProveedorDTO;
import com.uade.FacundoMayordomo1149479.model.Proveedor;
import com.uade.FacundoMayordomo1149479.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {



   private final ProveedorRepository ProveedorRepository;

    public ProveedorService(ProveedorRepository ProveedorRepository) {
        this.ProveedorRepository = ProveedorRepository;
    }

    public List<ProveedorDTO> getAllProveedors() {
        List<Proveedor> Proveedors = ProveedorRepository.findAll();

        return Proveedors.stream().map(this::ProveedorEntity2ProveedorDTO).toList();

   }

   public ProveedorDTO createProveedor(CreateProveedorDTO createProveedorDTO) {
        Proveedor proveedor = new Proveedor();
        proveedor.setContacto(createProveedorDTO.contacto());
        proveedor.setNombre(createProveedorDTO.nombre());
        Proveedor proveedor1 = ProveedorRepository.save(proveedor);
        return this.ProveedorEntity2ProveedorDTO(proveedor1);
   }



   private ProveedorDTO ProveedorEntity2ProveedorDTO(Proveedor Proveedor){
       return new ProveedorDTO(Proveedor.getId(), Proveedor.getNombre());
   }

}
