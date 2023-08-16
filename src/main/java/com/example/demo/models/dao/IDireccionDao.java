package com.example.demo.models.dao;

import com.example.demo.models.entity.Direccion;
import org.springframework.data.repository.CrudRepository;

public interface IDireccionDao extends CrudRepository<Direccion, Long> {
}
