package br.com.meli.starwarsapi.controller;

import br.com.meli.starwarsapi.entity.Personagem;
import br.com.meli.starwarsapi.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {

    @Autowired
    private PersonagemRepository personagemRepository;

    @GetMapping("/")
    public List<Personagem> getAllCharacters() {
        List<Personagem> personagens = personagemRepository.getAll();
        return personagens;
    }

    @GetMapping("/{name}")
    public List<Personagem> getCharactersByName(@PathVariable String name) {
        List<Personagem> personagens = personagemRepository.getByName(name);
        return personagens;
    }
}
