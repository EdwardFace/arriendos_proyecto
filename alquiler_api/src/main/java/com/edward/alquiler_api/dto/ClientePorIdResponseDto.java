package com.edward.alquiler_api.dto;


import com.edward.alquiler_api.model.Cliente;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class ClientePorIdResponseDto extends DatosResponseGeneralDto implements Serializable {

    private Cliente cliente;
}
