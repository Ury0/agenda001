package com.example.demo.agendaNext;

import java.util.Scanner;

import org.apache.catalina.webresources.Cache;

public class TelaUsuario {
    Scanner entrada = new Scanner(System.in);
    RepositorioDados repositorioDados = new RepositorioDados();
    Mediador Mediador = new Mediador(repositorioDados);
    ValidaçaoECadastro login = new ValidaçaoECadastro(Mediador);
   
    public TelaUsuario() {
        System.out.println(" -x: login\n-o: cadastro\n");
        switch(entrada.nextLine()){
            case "x":
                try{
                    Consumidor usuario = login.consultarUsuario();
                }catch(NumberFormatException Exception){
                    System.out.println("usuario n encontrado\ndeseja cadastrar novo usuario?\n");
                    if(entrada.nextLine().equals("sim")){
                        login.cadastrarUsuario();
                    }  
                }
                break;
            case "o":
                login.cadastrarUsuario();
                break;
            default:
                System.out.println("Opçao invalida\n");
                break;
        }
        
    }
    
}