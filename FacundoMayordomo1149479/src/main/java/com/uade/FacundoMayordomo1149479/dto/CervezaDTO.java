package com.uade.FacundoMayordomo1149479.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class CervezaDTO
{
    private String nombre;
    private int precio;
    private double porcentajeAlcohol;
    private Long proveedor_id;
    private Long estilo_id;
}
