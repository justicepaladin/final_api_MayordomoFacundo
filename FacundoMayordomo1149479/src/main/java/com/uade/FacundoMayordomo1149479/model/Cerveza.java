package com.uade.FacundoMayordomo1149479.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cerveza
{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) private String nombre;
    @Column(nullable = false) private int precio;
    @Column(nullable = false) private double porcentajeAlcohol;

    @ManyToOne @JoinColumn(name = "proveedor_id") private Proveedor proveedor;

    @ManyToOne @JoinColumn(name = "estilo_id") private Estilo estilo;


}