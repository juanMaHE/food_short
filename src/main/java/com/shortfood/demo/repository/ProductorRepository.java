package com.shortfood.demo.repository;

import com.shortfood.demo.model.Productor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductorRepository extends JpaRepository<Productor, Long> {
}
