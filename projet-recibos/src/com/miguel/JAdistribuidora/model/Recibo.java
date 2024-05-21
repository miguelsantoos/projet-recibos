package com.miguel.JAdistribuidora.model;

public class Recibo {


    private int diarias;
    private int valorDiaria;

    public Recibo(int diarias, int valorDiaria) {
        this.diarias = diarias;
        this.valorDiaria = valorDiaria;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public int getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(int valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
