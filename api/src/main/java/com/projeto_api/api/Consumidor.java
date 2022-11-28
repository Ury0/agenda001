package com.projeto_api.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="consumidor")
public class Consumidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String Cpf;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
}
