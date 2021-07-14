package br.com.meli.diplomaapi.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Disciplina {

    @NotBlank(message = "O campo nome da disciplina é obrigatório")
    @Size(min = 8, max = 50, message = "O campo nome da disciplina deve ter entre 8 e 50 caracteres")
    @Pattern(regexp = "[A-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+", message = "O campo nome da disciplina deve possuir apenas letras")
    private String nome;

    @NotNull(message = "O campo nota da disciplina é obrigátorio")
    @Size(min = 1, max = 2, message = "O campo nota da disciplina deve ter entre 1 e 2 numeros")
    @Pattern(regexp = "[0-9.]+", message = "O campo nota da disciplina deve ter apenas valores númericos")
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
