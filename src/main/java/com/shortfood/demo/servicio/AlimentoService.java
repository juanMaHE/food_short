package com.shortfood.demo.servicio;

import com.shortfood.demo.model.Alimento;
import com.shortfood.demo.repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlimentoService {

    @Autowired
    private AlimentoRepository alimentoRepository;

    public Alimento create(Alimento alimento) {
        return alimentoRepository.save(alimento);
    }

    public List<Alimento> getAllAlimentos() {
        return alimentoRepository.findAll();
    }

    public void delete(Alimento alimento) {
        alimentoRepository.delete(alimento);
    }

    public Optional<Alimento> findById(Long id) {
        return alimentoRepository.findById(id);
    }

}
