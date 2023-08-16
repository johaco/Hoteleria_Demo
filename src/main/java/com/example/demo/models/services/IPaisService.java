package com.example.demo.models.services;

import com.example.demo.models.entity.Pais;

import java.util.Optional;

public interface IPaisService {
    public Optional<Pais> findById(Long id);

}
