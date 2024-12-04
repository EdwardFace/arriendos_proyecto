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
@Table(name = "estados")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private int id_estado;
    @Column(nullable = false,length = 50)
    private String descripcion;

    @OneToMany(mappedBy = "estado")
    private List<Vehiculo> vehiculos;
}
