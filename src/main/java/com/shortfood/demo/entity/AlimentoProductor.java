package com.shortfood.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "alimento_productor", schema = "app_food")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AlimentoProductor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_productor")
    private Productor productor;

    @ManyToOne
    @JoinColumn(name = "id_alimento")
    private AlimentoVenta alimento;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlimentoProductor that = (AlimentoProductor) o;
        return Objects.equals(id, that.id) && Objects.equals(productor, that.productor) && Objects.equals(alimento, that.alimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productor, alimento);
    }
}
