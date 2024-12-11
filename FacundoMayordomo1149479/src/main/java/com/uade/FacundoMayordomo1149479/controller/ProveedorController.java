package com.uade.FacundoMayordomo1149479.controller;


import com.uade.FacundoMayordomo1149479.controller.DTOs.CreateProveedorDTO;
import com.uade.FacundoMayordomo1149479.controller.DTOs.ProveedorDTO;
import com.uade.FacundoMayordomo1149479.service.EstiloService;
import com.uade.FacundoMayordomo1149479.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin(origins = "*")
public class ProveedorController {


    @Autowired
    ProveedorService proveedorService;

    @GetMapping
    public ResponseEntity<List<ProveedorDTO>> getALlProveedores(){
        return new ResponseEntity<>(proveedorService.getAllProveedors(), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<ProveedorDTO> CreateProveedor(@RequestBody CreateProveedorDTO createProveedorDTO) {
        return new ResponseEntity<>(proveedorService.createProveedor(createProveedorDTO), HttpStatusCode.valueOf(200));
    }
}
