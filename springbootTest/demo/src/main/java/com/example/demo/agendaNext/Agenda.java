package com.example.demo.agendaNext;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    Scanner entrada = new Scanner(System.in);
    ArrayList<String> listaDataDisponivel = new ArrayList<String>(); //lista de horarios disponivei ao consumidor
    ArrayList<String> listaDatas = new ArrayList<String>(); // lista de horarios possivais a serem disponibilisados pelas assistencias


    public Agenda(ArrayList<String> lista){
        setListaDatas(lista);
    }
    
    public void marcaHorario(String data, String cpf){
        if(listaDataDisponivel.contains(data)){
            if(recuperaStatus(data).equals("1")){
                data.replace(data.substring((data.indexOf("*")+1),data.indexOf("#")),"-1");
                data.replace(data.substring(data.indexOf("$")),"$"+cpf+"*");
                
            }     
        }
    }
    public void desmarcaHorario(String data, String cpf){
        if(listaDataDisponivel.contains(data)){
            if(recuperaStatus(data).equals("1")&&(recuperaCPF(data).equals(cpf))){
                data.replace(data.substring((data.indexOf("*")+1),data.indexOf("#")),"1");
                data.replace(data.substring(data.indexOf("$")),"$*");
                
            }     
        }
    }
    public void DisponibilisarHorario(String data, String cnpj){
        if(listaDatas.contains(data)){
            if(recuperaStatus(data).equals("0")){
                data.replace(data.substring((data.indexOf("*")+1),data.indexOf("#")),"1#"+cnpj+"$*");
                listaDataDisponivel.add(data);
            }
                
        }
    }
    public void cancelaHorario(String dado, String cnpj){
        if(listaDataDisponivel.contains(dado)){
            if(!(recuperaStatus(dado).equals("0"))){
                listaDataDisponivel.remove(listaDataDisponivel.indexOf(dado));
            }
                
        }
        
    }

    private String recuperaData(String dados){
        return dados.substring(0, dados.indexOf("*"));
    }
    private String recuperaStatus(String dados){
        return dados.substring(dados.indexOf("*")+1, dados.indexOf("#"));
    }
    private String recuperaCNPJ(String dados){
        return dados.substring(dados.indexOf("#")+1, dados.indexOf("$"));
    }
    private String recuperaCPF(String dados){
        return dados.substring(dados.indexOf("$")+1, dados.lastIndexOf("*"));
    }
    
    public String lerData(){
        int ano = lerAno();
        int mes = lerMes();
        int dia = lerDia();
        int hora = lerHora();
        return ano+"/"+mes+"/"+dia+"/"+hora;
    }
    private int lerAno(){
        int ano;
        while(true){
            int a = entrada.nextInt();
            if(2022>a && a>1900){
                ano = a;
                break;
            }
        }
        return ano;
    }
    private int lerMes(){
        int mes;
        while(true){
            int a = entrada.nextInt();
            if(12>a && a>1){
                mes = a;
                break;
            }
        }
        return mes;
    }
    private int lerDia(){
        int dia;
        while(true){
            int a = entrada.nextInt();
            if(31>a && a>1){
                dia = a;
                break;
            }
        }
        return dia;
    }
    private int lerHora(){
        int hora;
        while(true){
            int a = entrada.nextInt();
            if(23>a && a>0){
                hora = a;
                break;
            }
        }
        return hora;
    }

    public ArrayList<String> getListaDataDisponivel() {
        return listaDataDisponivel;
    }
    public ArrayList<String> getListaDatas() {
        return listaDatas;
    }
    public void setListaDatas(ArrayList<String> listaDatas) {
        this.listaDatas = listaDatas;
    }
}
