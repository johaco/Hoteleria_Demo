package com.example.demo.models.services;

import com.example.demo.models.entity.Cliente;
import com.example.demo.models.entity.Hotel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IHotelService {
    public List<Hotel> findAll();

    public Hotel save(Hotel hotel);

    public Hotel findById(Long id);

    public void delete(Hotel hotel);
}
