package com.bsiback.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Tarcísio on 05/09/2016.
 */

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "car")
public class Carro {

    private String cor;
    private String Marca;
    private int Potencia;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getPotencia() {
        return Potencia;
    }
    public void setPotencia(int potencia) {
        Potencia = potencia;
    }}
