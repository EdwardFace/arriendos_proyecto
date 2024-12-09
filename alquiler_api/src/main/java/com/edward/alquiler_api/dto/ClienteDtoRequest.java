package com.edward.alquiler_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDtoRequest implements Serializable {
    private String nombre;
    private String email;
    private String telefono;
}
