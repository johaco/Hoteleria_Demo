package com.example.demo.models.services;

import com.example.demo.models.entity.Cliente;
import com.example.demo.models.entity.Direccion;

import java.util.List;

public interface IDireccionService {
    public List<Direccion> findAll();

    public void save(Direccion direccion);

    public Direccion findById(Long id);

    public void delete(Direccion direccion);
}
