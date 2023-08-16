package com.example.demo.models.services;

import com.example.demo.models.dao.IPaisDao;
import com.example.demo.models.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaisServiceImpl implements IPaisService {

    @Autowired
    private IPaisDao paisDao;

    @Override
    public Optional<Pais> findById(Long id) {
        return paisDao.findById(id);
    }
}
