package br.com.meli.diplomaapi.entity;

public class Disciplina {
    private String nome;
    private Double nota;

    public Disciplina(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
