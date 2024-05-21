package com.miguel.JAdistribuidora.service;

import com.miguel.JAdistribuidora.model.Motorista;

import java.util.ArrayList;
import java.util.List;

public class MotoristaService {

    private List<Motorista> listMotoristas;

    public MotoristaService() {
        this.listMotoristas = new ArrayList<>();
    }

    public void cadastrar(String nome, String chavePix, String cpf) {
        listMotoristas.add(new Motorista(nome,chavePix,cpf));
    }

    public void motoristasCadastrados() {
        System.out.println("Motoristas cadastrados");

        for (int i = 0; i < listMotoristas.size(); i++) {
            System.out.println(listMotoristas.get(i));
        }
    }

    public void remover(String nome) {
        List<Motorista> listRemover = new ArrayList<>();

        if (!listMotoristas.isEmpty()){
            for (Motorista elemento : listMotoristas) {
                if (elemento.getNome().equalsIgnoreCase(nome)){
                    listRemover.add(elemento);
                }
                listMotoristas.removeAll(listRemover);
            }
        }
        else System.out.println("Lista vazia");
    }

}
