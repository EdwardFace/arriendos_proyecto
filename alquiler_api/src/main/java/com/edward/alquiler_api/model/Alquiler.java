package com.edward.alquiler_api.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "arriendos")
public class Alquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id_alquiler;

    @ManyToOne
    @JoinColumn(name = "id_empleado",nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_cliente",nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo",nullable = false)
    private Vehiculo vehiculo;

    @Column(nullable = false)
    private LocalDateTime fecha_inicio;

    @Column(nullable = false)
    private LocalDateTime fecha_fin;

    @Column(nullable = false)
    private LocalDateTime fecha_entrega;

    @Column(nullable = false)
    private long costo;

}
