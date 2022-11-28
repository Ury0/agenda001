package com.example.demo.agendaNext;

import java.util.Scanner;

public class ValidaçaoECadastro {
    Scanner entrada = new Scanner(System.in);
    Mediador mediador;


    public ValidaçaoECadastro() {
    }
    public ValidaçaoECadastro(Mediador mediador) {
        this.mediador = mediador;
    }

    public Consumidor consultarUsuario(){
        Consumidor consumidor = this.mediador.buscarCPF(lerCPF());
        System.out.println("- Nome: "+consumidor.getNome()+"\n");
        System.out.println("- CPF: "+consumidor.getCPF()+"\n");
        System.out.println("- CEP: "+consumidor.getCEP()+"\n");
        System.out.println("- Email: "+consumidor.getEmail()+"\n");
        System.out.println("- Telefone: "+consumidor.getTelefone()+"\n");
        return consumidor;
    }
    public void cadastrarUsuario(){
        Consumidor novoConsumidor = new Consumidor();
        novoConsumidor.setNome(lernome());
        novoConsumidor.setCPF(lerCPF());
        novoConsumidor.setCEP(lerCEP());
        novoConsumidor.setEmail(lerEmail());
        novoConsumidor.setTelefone(lertelefone());
        this.mediador.AtualizaRepositorioUsuario(novoConsumidor);
        System.out.println("\ncadastro finalizado\n");

    }
    public Assistencia consultarAssistencia(){
        Assistencia consumidor = this.mediador.buscarCNPJ(lerCnpj());
        System.out.println("- Nome: "+consumidor.getNome()+"\n");
        System.out.println("- CPF: "+consumidor.getCnpj()+"\n");
        System.out.println("- CEP: "+consumidor.getCEP()+"\n");
        System.out.println("- Email: "+consumidor.getEmail()+"\n");
        System.out.println("- Telefone: "+consumidor.getTelefone()+"\n");
        return consumidor;
    }
    public void cadastrarAssistencia(){
        Assistencia novoConsumidor = new Assistencia();
        novoConsumidor.setNome(lernome());
        novoConsumidor.setCnpj(lerCnpj());
        novoConsumidor.setCEP(lerCEP());
        novoConsumidor.setEmail(lerEmail());
        novoConsumidor.setTelefone(lertelefone());
        this.mediador.AtualizaRepositorioAssistencia(novoConsumidor);
        System.out.println("\ncadastro finalizado\n");

    }
    public Produto consultarProduto(){
        Produto consumidor = this.mediador.buscarNumero(lerNumero());
        System.out.println("- Nome: "+consumidor.getNome()+"\n");
        System.out.println("- numero: "+consumidor.getNumero()+"\n");
        System.out.println("- data da garantia: "+consumidor.getGarantia()+"\n");
        return consumidor;
    }
    public void cadastrarProduto(){
        Produto novoConsumidor = new Produto();
        novoConsumidor.setNome(lernome());
        novoConsumidor.setNumero(lerNumero());
        novoConsumidor.setGarantia(lerData());
        this.mediador.AtualizaRepositorioProduto(novoConsumidor);
        System.out.println("\ncadastro finalizado\n");

    }



    private String lerData(){
        String nome="";
        while(true){
            System.out.print("\nData: ");
            String en = entrada.nextLine();
            if(en.length()>2){
                nome = en;
                break;
            }
        }
        return nome;
    }
    private String lernome(){
        String nome="";
        while(true){
            System.out.print("\nNome: ");
            String en = entrada.nextLine();
            if(en.length()>2){
                nome = en;
                break;
            }
        }
        return nome;
    }
    private String lerNumero(){
        String numero="";
        while(true){
            System.out.print("\nnumero: ");
            String en = entrada.nextLine();
            if(en.length()>10){
                numero = en;
                break;
            }
        }
        return numero;
    }
    private String lerCnpj(){
        String cnpj="";
        while(true){
            System.out.print("\nCNPJ: ");
            String en = entrada.nextLine();
            if(en.length()>10){
                cnpj = en;
                break;
            }
        }
        return cnpj;
    }
    private String lerCPF(){
        String cpf="";
        while(true){
            System.out.print("\nCPF: ");
            String en = entrada.nextLine();
            if(en.length()>10){
                cpf = en;
                break;
            }
        }
        return cpf;
    }
    private String lerCEP(){
        String cep="";
        while(true){
            System.out.print("\nCEP: ");
            String en = entrada.nextLine();
            if(en.length()>2){
                cep = en;
                break;
            }
        }
        return cep;
    }
    private String lerEmail(){
        String email="";
        while(true){
            System.out.print("\nEmail: ");
            String en = entrada.nextLine();
            if(en.length()>2){
                email = en;
                break;
            }
        }
        return email;
    }
    private long lertelefone(){
        long telefone;
        while(true){
            System.out.print("\nTelefone: ");
            long eint = entrada.nextLong();
            if(eint>2){
                telefone = eint;
                break;
            }
        }
        return telefone;
    }
}