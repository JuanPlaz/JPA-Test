package com.example.demo.servicios;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCliente {
    @Autowired
    private RepositorioCliente repoCliente;  //Se crea objeto repositorioCliente

    public List<Cliente> listarClientes(){
        return repoCliente.findAll();
    }

    public Cliente guardarCliente(Cliente cliente){
        return repoCliente.save(cliente);
    }

    public Cliente actualizarCliente(Cliente cliente){
        return repoCliente.save(cliente);
    }

    public void eliminarCliente(Cliente cliente){
        int id = cliente.getDocumento();

        repoCliente.delete(cliente);
    }

}
