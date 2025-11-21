package com.techware.services;

import com.techware.models.Cliente;

public interface ClienteService {
    Iterable<Cliente> getAll();
    Cliente newCliente(Cliente newCliente);
    Cliente modificarCliente(Cliente cliente);
    Boolean eliminarCliente(Long id_cliente);
}
