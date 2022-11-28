package com.example.demo.agendaNext;

import java.util.Scanner;

public class TelaADM {
    Scanner entrada = new Scanner(System.in);
    RepositorioDados repositorioDados = new RepositorioDados();
    Mediador Mediador = new Mediador(repositorioDados);
    ValidaçaoECadastro login = new ValidaçaoECadastro(Mediador);
    
   
    public TelaADM() {
        System.out.println("- 1: consumidor\n- 2: assistencia\n");
        switch(entrada.nextLine()){
            case "1":
                TelaUsuario telaUsuario = new TelaUsuario();
                break;
            case "2":
                TelaAssistencia telaAssistencia = new TelaAssistencia();
                break;
            case "3":
                login.cadastrarAssistencia();
                break;
            default:
                System.out.println("Opçao invalida\n");
                break;
        }
        
    }
    
    
}
