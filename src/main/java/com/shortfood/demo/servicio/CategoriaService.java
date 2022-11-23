package com.shortfood.demo.servicio;

import com.shortfood.demo.entity.Categoria;
import com.shortfood.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria create(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    public void delete(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }
}
