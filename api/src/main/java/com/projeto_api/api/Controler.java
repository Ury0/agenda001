package com.projeto_api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    //@Autowired
    //private Repositorio DB;

    //public Consumidor cadastrar(@RequestBody Consumidor consumidor){
    //    return this.DB.save(consumidor);
    //}

    @GetMapping("")
    public String mensagem(){
        return "INICIO\n";
    }
    @GetMapping("/hello/{nome}")
    public String hello(@PathVariable String nome){
        return "Hello "+nome;
    }
    @PostMapping("/Consumidor")
    public Consumidor consumidor(@RequestBody Consumidor c){
        return c;
    }
}
