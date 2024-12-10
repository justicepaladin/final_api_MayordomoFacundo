package com.uade.FacundoMayordomo1149479.controller;

import com.uade.FacundoMayordomo1149479.dto.CervezaDTO;
import com.uade.FacundoMayordomo1149479.model.Cerveza;
import com.uade.FacundoMayordomo1149479.service.CervezaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cerveza")
public class CervezaController
{

    private CervezaService cervezaService;

    public ResponseEntity<CervezaDTO> agregarCerveza(CervezaDTO cervezaDTO)
    {
        Cerveza nueva = cervezaService.agregarCerveza( cervezaDTO );
        return null;
    }
}
