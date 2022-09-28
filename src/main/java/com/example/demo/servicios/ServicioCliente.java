package com.example.demo.servicios;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorios.RepositorioCliente;

import java.util.List;

public class ServicioCliente {
    private RepositorioCliente repositorioCliente;

    public List<Cliente> listarClientes(){
        return repositorioCliente.findAll();
    }

    public Cliente guardarCliente(Cliente cliente){
        return repositorioCliente.save(cliente);
    }

    public Cliente actualizarCliente(Cliente cliente){
        return repositorioCliente.save(cliente);
    }

    public void eliminarCliente(Cliente cliente){
        repositorioCliente.delete(cliente);
    }

}
