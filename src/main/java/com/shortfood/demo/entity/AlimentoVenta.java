package com.shortfood.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "alimento_venta", schema = "app_food")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AlimentoVenta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_alimento")
    Alimento alimento;


}
