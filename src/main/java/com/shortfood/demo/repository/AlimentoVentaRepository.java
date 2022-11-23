package com.shortfood.demo.repository;

import com.shortfood.demo.entity.AlimentoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlimentoVentaRepository extends JpaRepository<AlimentoVenta, Long> {

    @Query(nativeQuery = true, value = "select * from app_food.alimento_venta a where id_alimento = ?1")
    List<AlimentoVenta> alimentoCategoria(Long id);

//    @Query(nativeQuery = true, value = "select * from app_food.alimento")
//    @Override
//    List<Alimento> findAll();
}
