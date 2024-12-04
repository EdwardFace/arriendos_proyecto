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
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id_empleado;
    @Column(nullable = false,length = 100)
    private String nombre;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 20)
    private String telefono;
    @Column(nullable = false, length = 20)
    private String usuario;
    @Column(nullable = false, length = 20)
    private String clave;

    @OneToMany(mappedBy = "empleado")
    private List<Alquiler> alquileres;

    @OneToMany(mappedBy = "empleado")
    private List<Pago> pagos;



}
