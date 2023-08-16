package com.example.demo.models.services;

import com.example.demo.models.dao.IPaisDao;
import com.example.demo.models.dao.IProvincia;
import com.example.demo.models.entity.Pais;
import com.example.demo.models.entity.Provincia;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProvinciaServiceImpl implements IProvinciaService{

    @Autowired
    private IProvincia provinciaDao;

    @Override
    public Optional<Provincia> findById(Long id) {
        return provinciaDao.findById(id);
    }
}
