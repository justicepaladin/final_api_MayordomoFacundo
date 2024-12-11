package com.uade.FacundoMayordomo1149479.controller;

import com.uade.FacundoMayordomo1149479.dto.CervezaDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import com.uade.FacundoMayordomo1149479.service.CervezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cerveza")
public class CervezaController
{

    @Autowired
    private CervezaService cervezaService;

    @CrossOrigin(origins = "http://localhost:5173" )
    @PostMapping("/nueva")
    public ResponseEntity<CervezaDTO> agregarCerveza(CervezaDTO cervezaDTO)
    {
        Cerveza nueva = cervezaService.agregarCerveza( cervezaDTO );
        return new ResponseEntity<>(nueva.toDTO(), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:5173" )
    @GetMapping("/todas")
    public ResponseEntity<List<CervezaDTO>> listarCervezas()
    {
        return new ResponseEntity<>(cervezaService.obtenerCervezas(),HttpStatus.OK);
    }
}
