package com.projeto_api.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Assistencia")
public class Assistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String Cnpj;

    public String getCnpj() {
        return Cnpj;
    }
    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
