package com.uade.FacundoMayordomo1149479.service;

import com.uade.FacundoMayordomo1149479.controller.DTOs.CervezaDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import com.uade.FacundoMayordomo1149479.repository.CervezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

 @Service
public class CervezaService {



    private final CervezaRepository cervezaRepository;

     public CervezaService(CervezaRepository cervezaRepository) {
         this.cervezaRepository = cervezaRepository;
     }

     public List<CervezaDTO> getAllCervezas() {
         List<Cerveza> cervezas = cervezaRepository.findAll();

         return cervezas.stream().map(this::CervezaEntity2CervezaDTO).toList();

    }

    public List<CervezaDTO> getCervezaByEstiloId(Long id) {
        List<Cerveza> cervezas = cervezaRepository.findCervezaByEstilo_Id(id).orElseThrow();

        return cervezas.stream().map(this::CervezaEntity2CervezaDTO).toList();
    }



    private CervezaDTO CervezaEntity2CervezaDTO(Cerveza cerveza){
        return new CervezaDTO(cerveza.getId(), cerveza.getNombre(), cerveza.getPrecio());
    }

}
