package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.agendaNext.Mediador;
import com.example.demo.agendaNext.RepositorioDados;
import com.example.demo.agendaNext.ValidaçaoECadastro;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner entrada = new Scanner(System.in);
    	RepositorioDados repositorioDados = new RepositorioDados();
    	Mediador Mediador = new Mediador(repositorioDados);
    	ValidaçaoECadastro login = new ValidaçaoECadastro(Mediador);

		boolean loop = true;
		while(loop){
			System.out.println("|1: consulta(consumidor)\n|2: cadastro(consumidor)\n|3: consulta(assistencia)\n|4: cadastro(assistencia)\n|5: cadastro(produto)\n|6: consulta(produto)\n");
			switch(entrada.nextLine()){
				case "1":
					login.consultarUsuario();
					break;
				case "2":
					login.cadastrarUsuario();
					break;
				case "3":
					login.consultarAssistencia();
					break;
				case "4":
					login.cadastrarAssistencia();
					break;
				case "5":
					login.cadastrarProduto();
					break;
				case "6":
					login.consultarProduto();
					break;
				case "sair":
					loop = false;
					break;
				default:
					System.out.println("Opçao invalida\n");
					break;
			}
		}
	}

	@GetMapping
	public String hello() {
		return "Hello World!";
	}

}

