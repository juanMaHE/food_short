package com.shortfood.demo.repository;

import com.shortfood.demo.entity.AlimentoProductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlimentoProductorRepository extends JpaRepository<AlimentoProductor,Long> {
}
