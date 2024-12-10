package com.uade.FacundoMayordomo1149479.service;

import com.uade.FacundoMayordomo1149479.dto.CervezaDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import com.uade.FacundoMayordomo1149479.model.Estilo;
import com.uade.FacundoMayordomo1149479.model.Proveedor;
import com.uade.FacundoMayordomo1149479.repository.CervezaRepository;
import com.uade.FacundoMayordomo1149479.repository.EstiloRepository;
import com.uade.FacundoMayordomo1149479.repository.ProveedorRepository;

import java.util.Optional;

public class CervezaService
{
    private CervezaRepository cervezaRepository;

    private ProveedorRepository proveedorRepository;

    private EstiloRepository estiloRepository;

    public Cerveza agregarCerveza(CervezaDTO cervezaDTO)
    {
        Long id_proveedor = cervezaDTO.getProveedor_id();
        Optional<Proveedor> prov = proveedorRepository.findById(id_proveedor);
        Long id_estilo = cervezaDTO.getEstilo_id();
        Optional<Estilo> est = estiloRepository.findById(id_estilo);
        if(prov.isPresent() && est.isPresent())
        {
            Cerveza nueva = Cerveza.builder()
                    .estilo(est.get())
                    .precio(cervezaDTO.getPrecio())
                    .nombre(cervezaDTO.getNombre()).proveedor(prov.get()).porcentajeAlcohol(cervezaDTO.getPorcentajeAlcohol())
                    .build();

            return nueva;
        }

        return null;
    }
}
