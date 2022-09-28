package com.example.demo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lineasdecredito")
public class LineaDeCredito {
    @Id
    private int codigoLinea;
    @Column(nullable = false, length = 30, unique = false)
    private String nombreLinea;
    private int montoMaximo;
    private int plazo;

    public LineaDeCredito(int codigoLinea, String nombreLinea, int montomaximo, int plazo) {
        this.codigoLinea = codigoLinea;
        this.nombreLinea = nombreLinea;
        this.montoMaximo = montomaximo;
        this.plazo = plazo;
    }

    public LineaDeCredito() {
    }

    public int getCodigoLinea() {
        return codigoLinea;
    }

    public void setCodigoLinea(int codigoLinea) {
        this.codigoLinea = codigoLinea;
    }

    public String getNombreLinea() {
        return nombreLinea;
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public int getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(int montomaximo) {
        this.montoMaximo = montomaximo;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
}
