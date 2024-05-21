package com.miguel.JAdistribuidora;

import com.miguel.JAdistribuidora.model.Motorista;
import com.miguel.JAdistribuidora.service.MotoristaService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MotoristaService motoristaService = new MotoristaService();

        motoristaService.cadastrar("Miguel","(88) 99371-465", "090.844.183-52");
        motoristaService.cadastrar("Sergio","(88) 8802-0122", "090.844.183-52");

        motoristaService.motoristasCadastrados();
    }
}
