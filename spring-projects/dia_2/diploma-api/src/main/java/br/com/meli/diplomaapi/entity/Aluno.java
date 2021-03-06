package br.com.meli.diplomaapi.entity;

import java.util.List;

public class Aluno {
    private int id;
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(int id, String nome, List<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
