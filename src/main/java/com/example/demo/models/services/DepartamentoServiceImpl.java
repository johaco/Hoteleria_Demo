package com.example.demo.models.services;

import com.example.demo.models.dao.IDepartamentoDao;
import com.example.demo.models.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {
    @Autowired
    private IDepartamentoDao departamentoDao;

    @Override
    public Optional<Departamento> findById(Long id) {
        return departamentoDao.findById(id);
    }
}
