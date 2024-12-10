package com.uade.FacundoMayordomo1149479.controller;

import com.uade.FacundoMayordomo1149479.controller.DTOs.CervezaDTO;
import com.uade.FacundoMayordomo1149479.controller.DTOs.EstiloDTO;
import com.uade.FacundoMayordomo1149479.service.CervezaService;
import com.uade.FacundoMayordomo1149479.service.EstiloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estilos")
public class EstiloController
{

    @Autowired
    EstiloService estiloService;

    @GetMapping()
    public ResponseEntity<List<EstiloDTO>> getAllEstilos() {
        return  new ResponseEntity<>(estiloService.getAllEstilos(), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<CervezaDTO>> getAllEstilos(@PathVariable Long id) {
        System.out.println(id);
        return new ResponseEntity<>(estiloService.getCervezasByID(id),HttpStatusCode.valueOf(200));
    }

}
