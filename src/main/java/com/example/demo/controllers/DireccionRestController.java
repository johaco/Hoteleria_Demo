package com.example.demo.controllers;


import com.example.demo.models.entity.Direccion;
import com.example.demo.models.services.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DireccionRestController {
    @Autowired
    private IDireccionService direccionService;

    @GetMapping("/direcciones")
    public List<Direccion> index() {
        return direccionService.findAll();
    }

    @GetMapping("/direcciones/{id}")
    public Direccion show(@PathVariable Long id) {
        return this.direccionService.findById(id);
    }

    @PostMapping("/direcciones")
    @ResponseStatus(HttpStatus.CREATED)
    public Direccion create(@RequestBody Direccion direccion) {
        direccion.setCreateAt(new Date());
        this.direccionService.save(direccion);
        return direccion;
    }

    @PutMapping("/direcciones/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Direccion update(@RequestBody Direccion direccion, @PathVariable Long id) {
        Direccion currentDireccion = this.direccionService.findById(id);
        currentDireccion.setDepartamento(direccion.getDepartamento());
        currentDireccion.setProvincia(direccion.getProvincia());
        currentDireccion.setPais(direccion.getPais());
        this.direccionService.save(currentDireccion);
        return currentDireccion;
    }

    @DeleteMapping("/direcciones/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Direccion currentDireccion = this.direccionService.findById(id);
        this.direccionService.delete(currentDireccion);
    }
}
