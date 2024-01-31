package com.example.EsercizioLezione;

import java.util.UUID;

public class Auto {

    private String modello;
    private String marca;
    private Integer cilindrata;
    private UUID id;
    private Integer numeroPorte;

    public Auto(String modello, String marca, Integer cilindrata, Integer numeroPorte) {
        this.modello = modello;
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.id = UUID.randomUUID();
        this.numeroPorte = numeroPorte;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public UUID getId() {
        return id;
    }


    public Integer getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(Integer numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
}
