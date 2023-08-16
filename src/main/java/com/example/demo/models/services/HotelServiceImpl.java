package com.example.demo.models.services;

import com.example.demo.models.dao.HotelDao;
import com.example.demo.models.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService{
    @Autowired
    private HotelDao hotelDao;

    @Override
    @Transactional(readOnly = true)
    public List<Hotel> findAll() {
        return (List<Hotel>) hotelDao.findAll();
    }

    @Override
    @Transactional
    public Hotel save(Hotel hotel) {
        for (Hotel hotelList: (List<Hotel>)hotelDao.findAll()) {
            if(hotelList.getDireccion().equals(hotel.getDireccion())) throw new RuntimeException("Esa direccion ya esta vinculada a un hotel");
        }
        hotelDao.save(hotel);
        return hotel;
    }

    @Override
    @Transactional(readOnly = true)
    public Hotel findById(Long id) {
        return hotelDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Hotel hotel) {
        hotelDao.delete(hotel);

    }
}
