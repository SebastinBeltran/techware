package com.techware.controllers;

import com.techware.models.Cliente;
import com.techware.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    @PostMapping("/nuevo")
    public Cliente newCliente(@RequestBody Cliente newCliente) {
        return this.clienteService.newCliente(newCliente);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Cliente> getAll() {
        return clienteService.getAll();
    }

    @PostMapping("/modificar")
    public Cliente modificarCliente(@RequestBody Cliente cliente) {
        return this.clienteService.modificarCliente(cliente);
    }

    @PostMapping(value="/{idcliente}")
    public Boolean eliminarCliente(@PathVariable(value="idcliente") Long idcliente) {
        return this.clienteService.eliminarCliente(idcliente);
    }

}
