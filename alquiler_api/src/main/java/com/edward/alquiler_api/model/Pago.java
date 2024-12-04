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
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id_pago;

    @ManyToOne
    @JoinColumn(name = "id_empleado",nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_alquiler",nullable = false)
    private Alquiler alquiler;

    @ManyToOne
    @JoinColumn(name = "id_metodo",nullable = false)
    private Metodo metodo;

    @Column(nullable = false)
    private LocalDateTime fecha;

    @Column(nullable = false)
    private long importe;


}
