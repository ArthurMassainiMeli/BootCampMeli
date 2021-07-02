package br.com.meli.starwarsapi.repository;

import br.com.meli.starwarsapi.entity.Personagem;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class PersonagemRepository {

    private static final File FILE = new File("src/main/resources/static/starwars.json");

    @Autowired
    private ObjectMapper mapper;

    public List<Personagem> getAll() {
        List<Personagem> personagens = new ArrayList<>();

        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Personagem>> typeReference = new TypeReference<List<Personagem>>() {
            };
            personagens = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personagens;
    }

    public List<Personagem> getByName(String name) {
        List<Personagem> personagens = getAll().stream().filter(p -> p.getName().contains(name)).collect(Collectors.toList());
        return personagens;
    }
}
