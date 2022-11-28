package com.example.demo.agendaNext;

import java.util.ArrayList;

public class RepositorioDados {
    ArrayList<Consumidor> listaConsumidor = new ArrayList<Consumidor>();
    ArrayList<Produto> listaProduto = new ArrayList<Produto>();
    ArrayList<Assistencia> listaAssistencia = new ArrayList<Assistencia>();
    ArrayList<String> listaDadosCalendario = new ArrayList<String>(); 

    public RepositorioDados() {
        geraCalendario();
    }

    public ArrayList<String> getListaDadosCalendario() {
        return listaDadosCalendario;
    }
    public ArrayList<Assistencia> getListaAssistencia() {
        return listaAssistencia;
    }
    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }
    public ArrayList<Consumidor> getListaConsumidor() {
        return listaConsumidor;
    }

    public void incluir(Consumidor usuario){
        this.listaConsumidor.add(usuario);
    }
    public void incluir(Assistencia assistencia){
        this.listaAssistencia.add(assistencia);
    }
    public void incluir(Produto produto){
        this.listaProduto.add(produto);
    }
    public void incluir(String dadoAgenda){
        this.listaDadosCalendario.add(dadoAgenda);
    }
    public void incluir(ArrayList<String> lista){
        for(String dadoAgenda:lista){
            this.listaDadosCalendario.add(dadoAgenda);
        }
    }
    
    private void geraCalendario(){
        for(int a =2018;a<2022;a++){
            for(int m = 1;m<12;m++){
                for(int d = 1;d<31;d++){
                    for(int h =70; h<180;h+=5 ){
                        this.listaDadosCalendario.add(a+"/"+m+"/"+d+"/"+h+"*0#$*");
                    }
                }
            }
        }
    }
    
    
    
}
