package com.shortfood.demo.repository;

import com.shortfood.demo.model.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

    @Query(nativeQuery = true, value = "select * from app_food.alimento a where id_categoria = ?1")
    List<Alimento> alimentoCategoria(Long id);
}
