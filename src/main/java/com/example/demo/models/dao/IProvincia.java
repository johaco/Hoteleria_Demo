package com.example.demo.models.dao;

import com.example.demo.models.entity.Pais;
import com.example.demo.models.entity.Provincia;
import org.springframework.data.repository.CrudRepository;

public interface IProvincia extends CrudRepository<Provincia, Long> {
}
