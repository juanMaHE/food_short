package com.shortfood.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contacto", schema = "app_food")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Contacto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefono;
    private String correo;
    private String telefono2;
    private String direccion;
    private String referencias;
}
