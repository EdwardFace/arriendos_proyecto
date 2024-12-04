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
@Table(name = "marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private int id_marca;
    @Column(nullable = false,length = 50)
    private String nombre;

    @OneToMany(mappedBy = "marca")
    private List<Vehiculo> vehiculos;
}
