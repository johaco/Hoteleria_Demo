package com.example.demo.models.services;

import com.example.demo.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findById(Long id);

    public void delete(Cliente cliente);

}


