package br.com.fortes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/ola/{nome}")
    public String ola(@PathVariable("nome") String n){

        return "Olá, "+n;
    }
}
