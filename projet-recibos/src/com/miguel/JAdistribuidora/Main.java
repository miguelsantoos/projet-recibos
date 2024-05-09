package com.miguel.JAdistribuidora;

import com.miguel.JAdistribuidora.model.Motorista;
import com.miguel.JAdistribuidora.service.MotoristaService;

public class Main {

    public static void main(String[] args) {

        Motorista motorista = new Motorista();
        motorista.setNome("Miguel Maxmillian Martins dos Santos");
        motorista.setCpf("123.456.789-10");
        motorista.setChavePix(123456789L);

        MotoristaService motoristaService = new MotoristaService();
        motoristaService.cadastrar(motorista);
        motoristaService.gerarRecibo(motorista);
    }
}
