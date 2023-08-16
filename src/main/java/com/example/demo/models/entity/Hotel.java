package com.example.demo.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="hoteles")
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String calificacion;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Cliente> clientes;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;


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

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {this.calificacion = calificacion; }

    public void setDireccion(Direccion direccion) {
        // Verificar si el país existe antes de establecer la relación
        if (direccion == null || direccion.getId() == null) {
            throw new IllegalArgumentException("La provincia es nulo o no tiene ID");
        }

        // Aquí puedes realizar una consulta a la base de datos o cualquier otra verificación para corroborar la existencia del país

        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private static final long serialVersionUID = 1L;
}
