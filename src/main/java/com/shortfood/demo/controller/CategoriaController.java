package com.shortfood.demo.controller;

import com.shortfood.demo.entity.Categoria;
import com.shortfood.demo.servicio.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/categorias")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CategoriaController {

    CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Categoria>> listarCategoriaPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(categoriaService.findById(id));
    }

    @GetMapping("/obtenerCategorias")
    private ResponseEntity<List<Categoria>> listarCategorias() {
        return ResponseEntity.ok(categoriaService.getAllCategorias());
    }
}
