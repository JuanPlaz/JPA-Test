package com.example.demo.controladores;

import com.example.demo.entidades.Cliente;
import com.example.demo.servicios.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ControladorCliente {
    @Autowired
    private ServicioCliente servCliente;
    @GetMapping
    public List<Cliente> listarInfoCliente(){       //Se retorna info del cliente en lista Json
        return servCliente.listarClientes();
    }

    @GetMapping("/{doc}")
    public Cliente consultaPorDoc(@PathVariable("doc")int documento){
        return servCliente.consultarClientePorDocumento(documento);
    }

    @PostMapping
    public Cliente guardarInfoCliente(@RequestBody Cliente infoCliente){    //Se usa el RequestBody para que reconozca el cuerpo de la petición
        return servCliente.guardarCliente(infoCliente);
    }
    @PutMapping
    public Cliente actualizarInfoCliente(@RequestBody Cliente infoCliente){
        return servCliente.actualizarCliente(infoCliente);
    }
    @DeleteMapping
    public void eliminarInfoCliente(@RequestBody Cliente infoCliente){
        servCliente.eliminarCliente(infoCliente);
    }

    @DeleteMapping("/{doc}")
    public void eliminarClientePorDoc(@PathVariable("doc")int doc){
        servCliente.eliminarClientePorDocumento(doc);

    }
}
