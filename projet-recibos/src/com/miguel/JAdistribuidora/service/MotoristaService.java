package com.miguel.JAdistribuidora.service;

import com.miguel.JAdistribuidora.model.Motorista;

public class MotoristaService {

    public void cadastrar(Motorista motorista) {
        System.out.println("Cadstrando motrista " + motorista.getNome());
    }

    public void gerarRecibo(Motorista motorista) {
        System.out.println("Gerando recibo no nome motrista " + motorista.getNome() + " de cpf " + motorista.getCpf() + " e chave pix " + motorista.getChavePix());
    }
}
