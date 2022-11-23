package com.shortfood.demo.controller;

import com.shortfood.demo.entity.AlimentoVenta;
import com.shortfood.demo.servicio.AlimentoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/alimentosVentas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class AlimentoVentaController {

    private AlimentoVentaService alimentoService;


    @Autowired
    public AlimentoVentaController(AlimentoVentaService alimentoService) {
        this.alimentoService = alimentoService;
    }

    @PostMapping
    private ResponseEntity<AlimentoVenta> guardar(@RequestBody AlimentoVenta alimento) {
        AlimentoVenta temporal = alimentoService.create(alimento);
        try {
            return ResponseEntity.created(new URI("/api/alimentos" + temporal.getId())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/obtenerAlimentosVenta")
    private ResponseEntity<List<AlimentoVenta>> listarAlimentos() {
        return ResponseEntity.ok(alimentoService.getAllAlimentos());
    }

    @GetMapping("/obtenerAlimentosCategoria/{id}")
    private ResponseEntity<List<AlimentoVenta>> listarAlimentosCategoria(@PathVariable("id") Long id) {
        return ResponseEntity.ok(alimentoService.getAllAlimentosCateoria(id));
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminarPersona(@RequestBody AlimentoVenta alimento) {
        alimentoService.delete(alimento);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<AlimentoVenta>> listarAlimentoporId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(alimentoService.findById(id));
    }
}
