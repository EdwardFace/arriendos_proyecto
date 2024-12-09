package com.edward.alquiler_api.service;

import com.edward.alquiler_api.constantes.Constantes;
import com.edward.alquiler_api.dto.ClienteDtoRequest;
import com.edward.alquiler_api.model.Cliente;
import com.edward.alquiler_api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        return clienteOptional.orElse(null);
    }

    @Override
    public String crearCliente(ClienteDtoRequest request) {
        Cliente clienteNuevo = Cliente.builder()
                .nombre(request.getNombre())
                .email(request.getEmail())
                .telefono(request.getTelefono())
                .build();
        try {
            clienteRepository.saveAndFlush(clienteNuevo);
            return Constantes.mensajeCliCrearExito;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String actualizarDatosCliente(int id,ClienteDtoRequest request) {
        try {
            Optional<Cliente> clienteOptional = clienteRepository.findById(id);
            if (clienteOptional.isPresent()){
                clienteOptional.get().setNombre(request.getNombre());
                clienteOptional.get().setEmail(request.getEmail());
                clienteOptional.get().setTelefono(request.getTelefono());

                clienteRepository.saveAndFlush(clienteOptional.get());
                return Constantes.mensajeCliActExito;
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }


        return "";
    }

    @Override
    public String eliminarClientePorId(int id) {
        try {
            clienteRepository.deleteById(id);
            return Constantes.mensajeCliEliminarExito;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
