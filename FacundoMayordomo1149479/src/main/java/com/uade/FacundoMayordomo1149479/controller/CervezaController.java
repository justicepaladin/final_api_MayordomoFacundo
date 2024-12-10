package com.uade.FacundoMayordomo1149479.controller;

import com.uade.FacundoMayordomo1149479.controller.DTOs.CervezaDTO;
import com.uade.FacundoMayordomo1149479.service.CervezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cerveza")
public class CervezaController
{

    @Autowired
    CervezaService cervezaService;

    @GetMapping()
    public ResponseEntity<List<CervezaDTO>> getAllCervezas() {
        return  new ResponseEntity<>(cervezaService.getAllCervezas(), HttpStatusCode.valueOf(200));
    }

}
