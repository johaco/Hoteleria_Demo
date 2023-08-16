package com.example.demo.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="provincias")
public class Provincia {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
    private List<Direccion> direcciones;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Provincia() {
    }
}
