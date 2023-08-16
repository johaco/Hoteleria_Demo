package com.example.demo.models.dao;


import com.example.demo.models.entity.Pais;
import org.springframework.data.repository.CrudRepository;

public interface IPaisDao extends CrudRepository<Pais, Long> {
}
