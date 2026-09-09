package demoapp.controller;

import javax.validation.constraints.NotNull;

public class NumeroData {
    @NotNull
    private Integer numero;

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }
}