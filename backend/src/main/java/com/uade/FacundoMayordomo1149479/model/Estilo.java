package com.uade.FacundoMayordomo1149479.model;


import jakarta.persistence.*;

@Entity
public class Estilo {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) private String nombre;

}
