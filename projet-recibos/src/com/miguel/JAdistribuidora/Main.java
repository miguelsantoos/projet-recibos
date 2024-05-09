package com.miguel.JAdistribuidora;

import com.miguel.JAdistribuidora.model.Motorista;
import com.miguel.JAdistribuidora.service.MotoristaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nome do motorista: ");
        String nome = scanner.next();

        System.out.println("Digite o cpf do motorista: ");
        String cpf = scanner.next();

        System.out.println("Digite a chave pix do motorista: ");
        Long chavePix = scanner.nextLong();

        Motorista motorista = new Motorista();
        motorista.setNome(nome);
        motorista.setCpf(cpf);
        motorista.setChavePix(chavePix);

        MotoristaService motoristaService = new MotoristaService();
        motoristaService.cadastrar(motorista);
        motoristaService.gerarRecibo(motorista);
    }
}
