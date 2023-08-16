package com.example.demo.models.services;

import com.example.demo.models.dao.IClienteDao;
import com.example.demo.models.dao.IDireccionDao;
import com.example.demo.models.entity.Cliente;
import com.example.demo.models.entity.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DireccionServiceImpl implements IDireccionService {
    @Autowired
    private IDireccionDao direccionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Direccion> findAll() {
        return (List<Direccion>) direccionDao.findAll();
    }

    @Override
    @Transactional
    public void save(Direccion direccion) {
        direccionDao.save(direccion);
    }

    @Override
    @Transactional(readOnly = true)
    public Direccion findById(Long id) {
        return direccionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Direccion direccion) {
        direccionDao.delete(direccion);

    }
}
