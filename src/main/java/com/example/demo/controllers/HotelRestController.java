package com.example.demo.controllers;

import com.example.demo.models.entity.Direccion;
import com.example.demo.models.entity.Hotel;
import com.example.demo.models.services.IDireccionService;
import com.example.demo.models.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")

public class HotelRestController {

    @Autowired
    private IHotelService hotelService;

    @Autowired
    private IDireccionService direccionService;

    @GetMapping("/hoteles")
    public List<Hotel> index() {
        return hotelService.findAll();
    }

    @GetMapping("/hoteles/{id}")
    public Hotel show(@PathVariable Long id) {
        return this.hotelService.findById(id);
    }

    @PostMapping("/hoteles")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> create(@RequestBody Hotel hotel) {
        try {
            hotel.setCreateAt(new Date());
            Direccion direccionFound = direccionService.findById(hotel.getDireccion().getId());
            if(direccionFound == null) throw new RuntimeException("No existe esa direccion");
            hotel.setDireccion(direccionFound);
            this.hotelService.save(hotel);
            return ResponseEntity.status(HttpStatus.OK).body(hotel);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("success", false, "message", e.getMessage()));
        }
    }

    @PutMapping("/hoteles/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Hotel update(@RequestBody Hotel hotel, @PathVariable Long id) {
        Hotel currentHotel = this.hotelService.findById(id);
        currentHotel.setNombre(hotel.getNombre());
        currentHotel.setCalificacion(hotel.getCalificacion());
        this.hotelService.save(currentHotel);
        return currentHotel;
    }

    @DeleteMapping("/hoteles/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Hotel currentHotel = this.hotelService.findById(id);
        this.hotelService.delete(currentHotel);
    }
}