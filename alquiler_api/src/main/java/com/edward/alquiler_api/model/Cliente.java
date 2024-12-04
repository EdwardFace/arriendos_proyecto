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
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id_cliente;
    @Column(nullable = false,length = 100)
    private String nombre;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 20)
    private String telefono;

    @OneToMany(mappedBy = "cliente")
    private List<Alquiler> alquileres;
}
