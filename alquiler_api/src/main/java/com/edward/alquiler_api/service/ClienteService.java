package com.edward.alquiler_api.service;

import com.edward.alquiler_api.dto.ClienteDtoRequest;
import com.edward.alquiler_api.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> obtenerClientes();
    Cliente obtenerClientePorEmail(String email);
    String crearCliente(ClienteDtoRequest request);
    String actualizarDatosCliente(int id,ClienteDtoRequest request);
    String eliminarClientePorId(int id);
}
