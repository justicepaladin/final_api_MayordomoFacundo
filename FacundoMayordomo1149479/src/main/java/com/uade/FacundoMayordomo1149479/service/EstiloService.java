package com.uade.FacundoMayordomo1149479.service;

import com.uade.FacundoMayordomo1149479.controller.DTOs.CervezaDTO;
import com.uade.FacundoMayordomo1149479.controller.DTOs.EstiloDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import com.uade.FacundoMayordomo1149479.model.Estilo;
import com.uade.FacundoMayordomo1149479.repository.CervezaRepository;
import com.uade.FacundoMayordomo1149479.repository.EstiloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstiloService {


   private final EstiloRepository estiloRepository;

   private final CervezaService cervezaService;

    public EstiloService(EstiloRepository estiloRepository, CervezaService cervezaService) {
        this.estiloRepository = estiloRepository;
        this.cervezaService = cervezaService;
    }

    public List<EstiloDTO> getAllEstilos() {
        List<Estilo> estilos = estiloRepository.findAll();
        return estilos.stream().map(this::EstiloEntity2EstiloDTO).toList();
   }

   public List<CervezaDTO> getCervezasByID(Long id) {
        return  cervezaService.getCervezaByEstiloId(id);
   }



   private EstiloDTO EstiloEntity2EstiloDTO(Estilo estilo){
       return new EstiloDTO(estilo.getId(),estilo.getNombre());
   }

}
