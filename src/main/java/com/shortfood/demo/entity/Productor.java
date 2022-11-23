package com.shortfood.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "productor", schema = "app_food")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Productor implements Serializable {
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

//
//    @OneToMany(mappedBy = "productor", cascade = CascadeType.ALL)
//    Set<AlimentoProductor> alimentoProductor = new HashSet<>();

}