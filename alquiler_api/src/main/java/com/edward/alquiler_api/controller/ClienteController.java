package com.edward.alquiler_api.controller;

import com.edward.alquiler_api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;



}
