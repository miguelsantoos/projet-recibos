package com.miguel.JAdistribuidora.model;

public class Motorista {

    private String nome;
    private String chavePix;
    private String cpf;

    public Motorista(String nome, String chavePix, String cpf) {
        this.nome = nome;
        this.chavePix = chavePix;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                " chave pix: " + chavePix +
                " cpf: " + cpf;
    }
}
