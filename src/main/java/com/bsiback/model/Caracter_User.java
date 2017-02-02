package com.bsiback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by tarcisio on 30-01-2017.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users_caract")
@Entity
@Table(name="users_caract")
public class Caracter_User {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name="nome_completo")
    private String nomeCompleto;

    @Column( name = "cargo" )
    private String cargo;

    @Column( name = "email" )
    private String email;

    @Column( name = "conhecimentos" )
    private String conhecimentos;

    @Column( name = "salario" )
    private float salario;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(String conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public void setSalario(float salario) {
        this.salario  = salario;
    }
}
