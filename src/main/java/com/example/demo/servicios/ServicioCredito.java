package com.example.demo.servicios;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Credito;
import com.example.demo.repositorios.RepositorioCliente;
import com.example.demo.repositorios.RepositorioCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCredito {
    @Autowired
    private RepositorioCredito repoCredito;  //Se crea objeto repositorioCliente

    public List<Credito> listarCredito(){
        return repoCredito.findAll();
    }

    public Credito guardarCredito(Credito credito){
        return repoCredito.save(credito);
    }

    public Credito actualizarCredito(Credito credito){
        return repoCredito.save(credito);
    }

    public void eliminarCredito(Credito credito){
        repoCredito.delete(credito);
    }

}
