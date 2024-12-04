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
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id_vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_marca",nullable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_tipo",nullable = false)
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_estado",nullable = false)
    private Estado estado;

    @OneToMany(mappedBy = "vehiculo")
    private List<Alquiler> alquileres;
}
