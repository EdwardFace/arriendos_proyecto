package com.edward.alquiler_api.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class DatosResponseGeneralDto implements Serializable {
    private int codigo;
}
