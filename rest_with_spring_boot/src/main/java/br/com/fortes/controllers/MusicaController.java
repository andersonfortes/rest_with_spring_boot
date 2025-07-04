package br.com.fortes.controllers;

import br.com.fortes.model.Album;
import br.com.fortes.model.Musica;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicaController {

    //http://localhost:8080/musica
    @RequestMapping("/musica")
    public Musica musica( ){
        return new Musica(1, "Faroeste Caboblo", new Album("Estacoes", 1998));
    }

}
