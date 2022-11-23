package com.shortfood.demo.servicio;

import com.shortfood.demo.entity.Alimento;
import com.shortfood.demo.repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoService {

    private final AlimentoRepository alimentoRepository;

    @Autowired
    public AlimentoService(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    @Cacheable(value = "getAllAlimentos")
    public List<Alimento> getAllAlimentos() {
        return alimentoRepository.findAll();
    }

}
