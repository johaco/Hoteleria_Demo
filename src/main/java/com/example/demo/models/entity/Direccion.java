package com.example.demo.models.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="direcciones")
public class Direccion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "direccion")
    private Hotel hotel;
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartamento(Departamento departamento) {
        // Verificar si el país existe antes de establecer la relación
        if (departamento == null || departamento.getId() == null) {
            throw new IllegalArgumentException("El departamento es nulo o no tiene ID");
        }

        // Aquí puedes realizar una consulta a la base de datos o cualquier otra verificación para corroborar la existencia del país

        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setProvincia(Provincia provincia) {
        // Verificar si el país existe antes de establecer la relación
        if (provincia == null || provincia.getId() == null) {
            throw new IllegalArgumentException("La provincia es nulo o no tiene ID");
        }

        // Aquí puedes realizar una consulta a la base de datos o cualquier otra verificación para corroborar la existencia del país

        this.provincia = provincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setPais(Pais pais) {
        // Verificar si el país existe antes de establecer la relación
        if (pais == null || pais.getId() == null) {
            throw new IllegalArgumentException("El país es nulo o no tiene ID");
        }

        // Aquí puedes realizar una consulta a la base de datos o cualquier otra verificación para corroborar la existencia del país

        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }


    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private static final long serialVersionUID = 1L;
}
