package com.uade.FacundoMayordomo1149479.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Estilo {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) private String nombre;

    @OneToMany(mappedBy = "estilo", fetch = FetchType.EAGER) private List<Cerveza> cervezas;

}
