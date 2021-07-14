package br.com.meli.diplomaapi.entity;

import javax.validation.constraints.*;

public class Disciplina {

    @NotBlank(message = "O campo nome da disciplina é obrigatório")
    @Pattern(regexp = "[A-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+", message = "O campo nome da disciplina deve possuir apenas letras")
    @Size(min = 8, max = 50, message = "O campo nome da disciplina deve ter entre 8 e 50 caracteres")
    private String nome;

    @NotNull(message = "O campo nota da disciplina é obrigátorio")
    @Min(value = 0, message = "O campo nota da disciplina tem que estar entre 0 e 10")
    @Max(value = 10, message = "O campo nota da disciplina tem que estar entre 0 e 10")
    private int nota;

    public Disciplina(String nome, int nota) {
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
