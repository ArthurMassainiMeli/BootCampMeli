package br.com.meli.diplomaapi.model;

import br.com.meli.diplomaapi.entity.Aluno;

import java.util.*;

public class AlunoModel {
    private static List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> getAll() {
        return alunos;
    }

    public void insertOne(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno getById(Integer id) {
        Optional<Aluno> alunoOptional = alunos.stream().filter(a -> a.getId() == id).findFirst();
        if (alunoOptional.isPresent()) {
            return alunoOptional.get();
        }
        return null;
    }


}
