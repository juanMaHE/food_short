package com.shortfood.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "alimento", schema = "app_food")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int id_categoria;

    private String descripcion;


}
