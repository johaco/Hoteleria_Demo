package com.example.demo.models.dao;

import com.example.demo.models.entity.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface HotelDao extends CrudRepository<Hotel, Long> {

}
