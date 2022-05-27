package com.shortfood.demo.controller;

import com.shortfood.demo.model.Categoria;
import com.shortfood.demo.servicio.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/categorias")
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
