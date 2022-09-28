package com.example.demo.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "creditos")
public class Credito {
    @Id
    private int codigoCredito;
    @Column(nullable = false)
    private int montoPrestado;
    @Column(nullable = false)
    private int plazo;
    @Column(nullable = false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name="doccliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="codigolinea", nullable = false)
    private LineaDeCredito linea;

}
