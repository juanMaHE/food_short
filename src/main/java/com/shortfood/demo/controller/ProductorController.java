package com.shortfood.demo.controller;

import com.shortfood.demo.model.Productor;
import com.shortfood.demo.servicio.ProductorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/productor")
public class ProductorController {

    private ProductorServicio productorServicio;

    @Autowired
    public ProductorController(ProductorServicio productorServicio) {
        this.productorServicio = productorServicio;
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Productor>> listarProductorPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(productorServicio.findById(id));
    }
}
