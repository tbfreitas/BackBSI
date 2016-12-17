package com.bsiback.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Tarcísio on 12/09/2016.
 */
public class Team {

    private String Nome;
    private String Image;

    @JsonProperty("Nome")
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    @JsonProperty("Image")
    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
