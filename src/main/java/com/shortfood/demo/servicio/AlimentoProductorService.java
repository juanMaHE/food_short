package com.shortfood.demo.servicio;

import com.shortfood.demo.entity.AlimentoProductor;
import com.shortfood.demo.repository.AlimentoProductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoProductorService {
    @Autowired
    private AlimentoProductorRepository alimentoProductorRepository;


    public List<AlimentoProductor> getAllAlimentosProductores() {
        return alimentoProductorRepository.findAll();
    }


}
