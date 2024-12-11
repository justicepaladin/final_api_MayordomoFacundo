package com.uade.FacundoMayordomo1149479.controller;

import com.uade.FacundoMayordomo1149479.controller.DTOs.CervezaDTO;
import com.uade.FacundoMayordomo1149479.controller.DTOs.CreateCervezaDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import com.uade.FacundoMayordomo1149479.service.CervezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceAlreadyExistsException;
import java.util.List;

@RestController
@RequestMapping("/cerveza")
@CrossOrigin(origins = "*")
public class CervezaController
{

    @Autowired
    CervezaService cervezaService;

    @GetMapping()
    public ResponseEntity<List<CervezaDTO>> getAllCervezas() {
        return  new ResponseEntity<>(cervezaService.getAllCervezas(), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<CervezaDTO> createCerveza(@RequestBody CreateCervezaDTO createCervezaDTO) throws InstanceAlreadyExistsException {
        return new ResponseEntity<>(cervezaService.createCerveza(createCervezaDTO),HttpStatusCode.valueOf(200));
    }

}
