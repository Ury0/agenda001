package com.example.demo.agendaNext;

public class Consumidor {
    private String nome;
    private String CPF;
    private String CEP;
    private String email;
    private long telefone;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getTelefone() {
        return telefone;
    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

}
