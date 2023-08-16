package com.example.demo.models.services;

import com.example.demo.models.entity.Departamento;


import java.util.Optional;

public interface IDepartamentoService {
    public Optional<Departamento> findById(Long id);
}
