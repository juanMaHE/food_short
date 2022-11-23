package com.shortfood.demo.servicio;

import com.shortfood.demo.entity.AlimentoVenta;
import com.shortfood.demo.repository.AlimentoVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlimentoVentaService {

    @Autowired
    private AlimentoVentaRepository alimentoVentaRepository;

    public AlimentoVenta create(AlimentoVenta alimento) {
        return alimentoVentaRepository.save(alimento);
    }

    public List<AlimentoVenta> getAllAlimentos() {
        return alimentoVentaRepository.findAll();
    }

    public List<AlimentoVenta> getAllAlimentosCateoria(Long id) {
        return alimentoVentaRepository.alimentoCategoria(id);
    }

    public void delete(AlimentoVenta alimento) {
        alimentoVentaRepository.delete(alimento);
    }

    public Optional<AlimentoVenta> findById(Long id) {
        return alimentoVentaRepository.findById(id);
    }

}
