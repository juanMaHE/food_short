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

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String sexo;
    private int edad;
    private String imagen;

    @OneToOne
    @JoinColumn(name = "id_contacto")
    Contacto contacto;

}