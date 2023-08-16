package com.example.demo.models.services;

import com.example.demo.models.entity.Pais;
import com.example.demo.models.entity.Provincia;

import java.util.Optional;

public interface IProvinciaService {

    public Optional<Provincia> findById(Long id);

}
