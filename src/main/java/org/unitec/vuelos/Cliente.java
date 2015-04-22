/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.vuelos;

import java.io.Serializable;

/**
 *
 * @author T-107
 */
public class Cliente implements Serializable {
 private String numeroDeVuelo;
 private String aerolinea;
 private String numeroDeBoletos;
 private String fechaDeSalida;
 private String Origen;
 private String Destino;

    public Cliente(){
        
    }

   

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setNumeroDeBoletos(String numeroDeBoletos) {
        this.numeroDeBoletos = numeroDeBoletos;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getNumeroDeBoletos() {
        return numeroDeBoletos;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getDestino() {
        return Destino;
    }

  

}
