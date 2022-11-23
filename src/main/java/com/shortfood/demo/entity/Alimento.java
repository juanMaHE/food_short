package com.shortfood.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "alimento", schema = "app_food", catalog = "postgres")
public class Alimento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @OneToOne
    @JoinColumn(name = "id_categoria")
    Categoria categoria;
    @Basic
    @Column(name = "imagen")
    private String imagen;


}
