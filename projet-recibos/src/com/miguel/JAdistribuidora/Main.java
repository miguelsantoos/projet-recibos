package com.miguel.JAdistribuidora;

import com.miguel.JAdistribuidora.service.MotoristaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção 1 para cadastrar, e 2 para sair:");
        int opcao = scanner.nextInt();

        while (opcao!=2){
            System.out.println("Nome");
            String nome = scanner.next();

            System.out.println("Chave pix:");
            String chavePix = scanner.next();


            System.out.println("CPF:");
            String cpf = scanner.next();



            fazer(nome, chavePix, cpf);


            System.out.println(" ");
            System.out.println("Escolha a opção 1 para cadastrar, e 2 para sair:");
            opcao = scanner.nextInt();
        }

    }

    public static void fazer(String nome, String chavePix, String cpf){
        MotoristaService motoristaService = new MotoristaService();

        /**
         *  O motorista ta sendo cadastrado no mesmo espaço dentro do arrayList
         */
        motoristaService.cadastrar(nome,chavePix, cpf);

        motoristaService.motoristasCadastrados();



    }
}
