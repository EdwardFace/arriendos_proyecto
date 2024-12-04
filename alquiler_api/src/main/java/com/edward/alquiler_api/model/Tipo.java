package com.edward.alquiler_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipos")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private int id_tipo;
    @Column(nullable = false,length = 20)
    private String descripcion;
    @Column(nullable = false)
    private String descripcion_ampliada;
    @Column(nullable = false)
    private long costo_alquiler;

    @OneToMany(mappedBy = "tipo")
    private List<Vehiculo> vehiculos;

}
