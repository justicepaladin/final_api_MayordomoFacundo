package com.uade.FacundoMayordomo1149479.controller;

import com.uade.FacundoMayordomo1149479.dto.CervezaDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import com.uade.FacundoMayordomo1149479.service.CervezaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cerveza")
public class CervezaController
{

    private CervezaService cervezaService;

    @PostMapping("/nueva")
    public ResponseEntity<CervezaDTO> agregarCerveza(CervezaDTO cervezaDTO)
    {
        Cerveza nueva = cervezaService.agregarCerveza( cervezaDTO );
        return new ResponseEntity<>(nueva.toDTO(), HttpStatus.CREATED);
    }

    @GetMapping("/todas")
    public ResponseEntity<List<CervezaDTO>> listarCervezas()
    {
        return new ResponseEntity<>(cervezaService.obtenerCervezas(),HttpStatus.OK);
    }
}
