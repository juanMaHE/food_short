package com.shortfood.demo.controller;

import com.shortfood.demo.entity.Alimento;
import com.shortfood.demo.servicio.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/alimentos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AlimentoController {
    AlimentoService alimentoService;

    @Autowired
    public AlimentoController(AlimentoService alimentoService) {
        this.alimentoService = alimentoService;
    }

    @Cacheable(value = "obtenerAlimentos")
    @GetMapping("/obtenerAlimentos")
    public ResponseEntity<List<Alimento>> listarAlimentos() {
        return ResponseEntity.ok(alimentoService.getAllAlimentos());
    }

}
