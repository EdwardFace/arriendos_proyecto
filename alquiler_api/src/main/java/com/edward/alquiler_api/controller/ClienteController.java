package com.edward.alquiler_api.controller;

import com.edward.alquiler_api.dto.ClienteDtoRequest;
import com.edward.alquiler_api.dto.ResponseDto;
import com.edward.alquiler_api.model.Cliente;
import com.edward.alquiler_api.service.ClienteService;
import com.edward.alquiler_api.util.FuncionesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    /**
     * Función para crear un cliente.
     * @author Edward
     * @since 05-08-2025
     * @return Devuelve un ResponseDto
     * **/
    @PostMapping(value = "/crear", name = "crear un cliente")
    public ResponseEntity<ResponseDto>crearCliente(@RequestBody ClienteDtoRequest request){
        String response = clienteService.crearCliente(request);
        if (response.equalsIgnoreCase("")) {
            return FuncionesUtil.crearMensaje(460, response, HttpStatus.BAD_REQUEST);
        }
        return FuncionesUtil.crearMensaje(200,response, HttpStatus.OK);
    }

    @GetMapping(value = "/todos",name = "retornar todos los clientes")
    public ResponseEntity<List<Cliente>>obtenerTodosLosClientes(){
        return new ResponseEntity<>(clienteService.obtenerClientes(), HttpStatus.OK);
    }

}
