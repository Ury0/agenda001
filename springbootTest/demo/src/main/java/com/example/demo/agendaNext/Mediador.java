package com.example.demo.agendaNext;

import java.util.ArrayList;

public class Mediador {
    RepositorioDados repositorioDados;
    public Mediador() {
    }
    public Mediador(RepositorioDados repositorioDados) {
        this.repositorioDados = repositorioDados;
    }
    public void AtualizaRepositorioUsuario(Consumidor consumidor){
        this.repositorioDados.incluir(consumidor);
    }
    public void AtualizaRepositorioAssistencia(Assistencia assistencia){
        this.repositorioDados.incluir(assistencia);
    }
    public void AtualizaRepositorioProduto(Produto produto){
        this.repositorioDados.incluir(produto);
    }
    public void AtualizaRepositorioAgenda(ArrayList<String> lista){
        this.repositorioDados.incluir(lista);
    }
    public ArrayList<String> buscaAgenda(){
        return this.repositorioDados.getListaDadosCalendario();
    }
    public Consumidor buscarCPF(String cpf){
        Consumidor usuario = null;
        for(Consumidor user : this.repositorioDados.getListaConsumidor()){
            if(user.getCPF().equals(cpf)){
                 usuario= user;
                break;
            }else{System.out.print("ERRO: Usuario nao encontrado");}
        }
        return usuario;
    }
    public Assistencia buscarCNPJ(String cnpj){
        Assistencia assistencia = null;
        for(Assistencia assis : this.repositorioDados.getListaAssistencia()){
            if(assis.getCnpj().equals(cnpj)){
                 assistencia= assis;
                break;
            }else{System.out.print("ERRO: Assistencia nao encontrada");}
        }
        return assistencia;
    }
    public Produto buscarNumero(String numero){
        Produto produto = null;
        for(Produto produ : this.repositorioDados.getListaProduto()){
            if(produ.getNumero().equals(numero)){
                 produto= produ;
                break;
            }else{System.out.print("ERRO: Assistencia nao encontrada");}
        }
        return produto;
    }
    

    
    
    
}
