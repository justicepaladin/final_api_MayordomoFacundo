package com.uade.FacundoMayordomo1149479.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "proveedor")
public class Proveedor {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) private String nombre;

    @Column(nullable = false) private String contacto;

    @OneToMany(mappedBy = "proveedor", fetch = FetchType.EAGER) private List<Cerveza> cervezas;



}
