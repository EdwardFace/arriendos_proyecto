package com.edward.alquiler_api.controller;


import com.edward.alquiler_api.constantes.Constantes;
import com.edward.alquiler_api.dto.ClienteDtoRequest;
import com.edward.alquiler_api.dto.ClientePorIdRequestDto;
import com.edward.alquiler_api.dto.ClientePorIdResponseDto;
import com.edward.alquiler_api.dto.ResponseGeneralDto;
import com.edward.alquiler_api.model.Cliente;
import com.edward.alquiler_api.service.ClienteService;
import com.edward.alquiler_api.util.FuncionesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/clientes/todos",produces = "application/json")
    public ResponseEntity<List<Cliente>> obtenerTodosClientes(){
        try{
            List<Cliente> response = clienteService.obtenerClientes();
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(List.of(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/clientes/crear")
    public ResponseEntity<ResponseGeneralDto> crearCliente(@RequestBody ClienteDtoRequest request){
        try{
            String response = clienteService.crearCliente(request);
            return FuncionesUtil.crearRespuesta(Constantes.CODIGO_EXITO,response,HttpStatus.OK);
        } catch (Exception e) {
            return FuncionesUtil.crearRespuesta(Constantes.CODIGO_ERROR,Constantes.MENSAJECLIERROR,HttpStatus.BAD_REQUEST);
        }
    }

//    @GetMapping(value = "/clientes/id")
//    public ResponseEntity<Cliente> obtenerClientePorId(@RequestBody ClientePorIdRequestDto requestDto){
//
//    }

}
