package com.example.demo.agendaNext;

import java.util.Scanner;

public class TelaAssistencia {
    Scanner entrada = new Scanner(System.in);
    RepositorioDados repositorioDados = new RepositorioDados();
    Mediador Mediador = new Mediador(repositorioDados);
    ValidaçaoECadastro login = new ValidaçaoECadastro(Mediador);
    Agenda agenda = new Agenda(Mediador.buscaAgenda());
    Assistencia assistencia;
    public TelaAssistencia() {
        try{
            System.out.println("login: ");
            assistencia = login.consultarAssistencia();
        }catch(NumberFormatException Exception){
            System.out.println("Assistencia nao encontrada\n");
        }
        
        switch(entrada.nextLine()){
            case "1":
                int i =0;
                for(String horario: Mediador.buscaAgenda()){
                    System.out.println(i+": "+horario+"\n");
                    i++;
                }
                break;
            case "2":
                agenda.DisponibilisarHorario(agenda.lerData(), assistencia.getCnpj());
                break;
            case "3":
                agenda.cancelaHorario(agenda.lerData(), assistencia.getCnpj());
                break;
            case "4":
                for(int j=1;j<12;j++){
                    for(int k=1;k<31;k++){
                        for(int h=70;h<180;h+=5){
                            agenda.DisponibilisarHorario("2022/"+j+"/"+k+"/"+h, assistencia.getCnpj());
                        }
                        
                    }
                    
                }
                break;
            
        }
        
    }
    
}