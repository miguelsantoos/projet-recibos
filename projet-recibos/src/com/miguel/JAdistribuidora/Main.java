package com.miguel.JAdistribuidora;

import com.miguel.JAdistribuidora.service.MotoristaService;

public class Main {

    public static void main(String[] args) {
        MotoristaService motoristaService = new MotoristaService();

        motoristaService.cadastrar("Miguel","(88) 9937-1465", "090.844.183-52");
        motoristaService.cadastrar("Sergio","(88) 8802-0122", "090.844.183-52");

        motoristaService.motoristasCadastrados();

        System.out.println(" ");

        motoristaService.remover("sergio");
        motoristaService.motoristasCadastrados();

        System.out.println(" ");

        motoristaService.geradorRecibo("miguel");

    }
}
