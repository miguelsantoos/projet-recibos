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

        if (!listMotoristas.contains(nome))
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
            }
            listMotoristas.removeAll(listRemover);
        }
        else System.out.println("Lista vazia");
    }

    public void geradorRecibo(String nome) {
        /**
         *  COMO PENSEI NA LOGICA:
         *
         *  Se o primeiro motorista analisado pelo "FOR" tiver o nome
         *  igual ao nome do parametro que ta sendo recebio, gere um recibo, se nao vá
         *  para o proximo.
         *
         *  Para  gerar o recibo selecione o motorista que tem o nome igual ao do parametro
         *  adicione ele a um novo array e assim pegue o nome, depois pegue a chave pix e por ultimo pegue o cpf.
         *
         */

        List<Motorista> listRecibos = new ArrayList<>();

        for (Motorista motorista : listMotoristas){
            if (motorista.getNome().equalsIgnoreCase(nome)){
                listRecibos.add(motorista);
            }
            System.out.println("Eu " + listRecibos.get(0).getNome() + " de cpf " + listRecibos.get(0).getCpf() +
                    " Recebi um valor de que sera depositado nessa chave pix " + listRecibos.get(0).getChavePix());
        }
    }
}

































