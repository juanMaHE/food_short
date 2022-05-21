package com.shortfood.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "productor", schema = "app_food")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Productor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String nombre;
    String apPaterno;
    String apMaterno;
    String sexo;
    int edad;
    int id_contacto;

}