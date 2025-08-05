package com.edward.alquiler_api.util;

import com.edward.alquiler_api.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class FuncionesUtil {

    public static ResponseEntity<ResponseDto> crearMensaje(int codigo,String mensaje, HttpStatus status){
        ResponseDto responseDto = ResponseDto.builder()
                .codigo(codigo)
                .mensaje(mensaje)
                .build();
        return new ResponseEntity<>(responseDto,status);
    }
}
