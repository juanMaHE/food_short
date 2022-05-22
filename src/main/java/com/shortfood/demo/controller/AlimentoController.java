package com.shortfood.demo.controller;

import com.shortfood.demo.model.Alimento;
import com.shortfood.demo.servicio.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/alimentos")
public class AlimentoController {

    @Autowired
    private AlimentoService alimentoService;

    @PostMapping
    private ResponseEntity<Alimento> guardar(@RequestBody Alimento alimento) {
        Alimento temporal = alimentoService.create(alimento);
        try {
            return ResponseEntity.created(new URI("/api/alimentos" + temporal.getId())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/obtenerAlimentos")
    private ResponseEntity<List<Alimento>> listarAlimentos() {
        return ResponseEntity.ok(alimentoService.getAllAlimentos());
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminarPersona(@RequestBody Alimento alimento) {
        alimentoService.delete(alimento);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Alimento>> listarAlimentoporId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(alimentoService.findById(id));
    }
}
