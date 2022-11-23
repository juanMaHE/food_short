package com.shortfood.demo.controller;

import com.shortfood.demo.entity.AlimentoProductor;
import com.shortfood.demo.servicio.AlimentoProductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/alimentosProductores")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class AlimentoProductorController {


    @Autowired
    AlimentoProductorService alimentoProductorService;

    @GetMapping("/obtenerAlimentosProductores")
    private ResponseEntity<List<AlimentoProductor>> listarAlimentos() {
        return ResponseEntity.ok(alimentoProductorService.getAllAlimentosProductores());
    }
}
