package com.techware.services;

import com.techware.models.Cliente;
import com.techware.repository.ClienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Iterable<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente newCliente(Cliente newCliente) {
        return clienteRepository.save(newCliente);
    }

    @Override
    public Cliente modificarCliente(Cliente cliente) {
        Optional<Cliente> clienteEncontrado = this.clienteRepository.findById(cliente.getIdcliente());
        if(clienteEncontrado.get() !=null){
            clienteEncontrado.get().setNombre(cliente.getNombre());
            clienteEncontrado.get().setApellido(cliente.getApellido());
            clienteEncontrado.get().setCorreoElectronico(cliente.getCorreoElectronico());
            return this.newCliente(clienteEncontrado.get());
        }
        return null;
    }
    @Override
        public Boolean eliminarCliente(Long id_cliente) {
            this.clienteRepository.deleteById(id_cliente);
            return true;
    }
}
