package com.bsiback.model;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Tarcísio on 12/09/2016.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "team")
@Entity
@Table(name="teams")
public class Team {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name="nome")
    private String Nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("Nome")
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

}
