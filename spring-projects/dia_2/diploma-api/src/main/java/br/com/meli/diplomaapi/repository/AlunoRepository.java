package br.com.meli.diplomaapi.repository;

import br.com.meli.diplomaapi.entity.Aluno;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AlunoRepository {
    private static final List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> getAll() {
        return alunos;
    }

    public Aluno insertOne(Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    public Optional<Aluno> getById(int id) {
        return alunos.stream().filter(a -> a.getId() == id).findFirst();
    }
}
