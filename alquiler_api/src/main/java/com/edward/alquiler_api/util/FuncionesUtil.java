package com.edward.alquiler_api.util;

import com.edward.alquiler_api.dto.ResponseGeneralDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class FuncionesUtil {

    public static ResponseEntity<ResponseGeneralDto> crearRespuesta(int codigo, String mensaje, HttpStatus status){
        ResponseGeneralDto responseGeneralDto = ResponseGeneralDto.builder()
                .codigo(codigo)
                .mensaje(mensaje)
                .build();

        return new ResponseEntity<>(responseGeneralDto, status);
    }
}
