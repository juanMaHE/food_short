package com.shortfood.demo.controller;

import com.shortfood.demo.entity.Productor;
import com.shortfood.demo.servicio.ProductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/productor")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ProductorController {

    private ProductorService productorServicio;

    @Autowired
    public ProductorController(ProductorService productorServicio) {
        this.productorServicio = productorServicio;
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Productor>> listarProductorPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(productorServicio.findById(id));
    }

    @GetMapping("/obtenerProductores")
    private ResponseEntity<List<Productor>> listarProductores() {
        return ResponseEntity.ok(productorServicio.getAllAlimentos());
    }
}
