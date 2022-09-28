package com.example.demo.servicios;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.LineaDeCredito;
import com.example.demo.repositorios.RepositorioCliente;
import com.example.demo.repositorios.RepositorioLineaDeCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioLineaDeCredito {
    @Autowired
    private RepositorioLineaDeCredito repoLDeCredito;
    public List<LineaDeCredito> listarLDC(){
        return repoLDeCredito.findAll();
    }

    public LineaDeCredito guardarLDC(LineaDeCredito linea){
        return repoLDeCredito.save(linea);
    }

    public LineaDeCredito actualizarLDC(LineaDeCredito linea){
        return repoLDeCredito.save(linea);
    }

    public void eliminarLDC(LineaDeCredito linea){
        repoLDeCredito.delete(linea);
    }
}
