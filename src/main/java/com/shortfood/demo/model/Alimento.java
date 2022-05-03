package com.shortfood.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "alimento", schema = "app_food")
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int id_categoria;


    public Alimento(Long id, String nombre, int id_categoria) {
        this.id = id;
        this.nombre = nombre;
        this.id_categoria = id_categoria;
    }

    public Alimento() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
}
