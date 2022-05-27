package com.shortfood.demo.servicio;

import com.shortfood.demo.model.Productor;
import com.shortfood.demo.repository.ProductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductorService {

    @Autowired
    private ProductorRepository productorRepository;

    public Productor create(Productor productor) {
        return productorRepository.save(productor);
    }

    public List<Productor> getAllAlimentos() {
        return productorRepository.findAll();
    }

    public void delete(Productor productor) {
        productorRepository.delete(productor);
    }

    public Optional<Productor> findById(Long id) {
        return productorRepository.findById(id);
    }
}
