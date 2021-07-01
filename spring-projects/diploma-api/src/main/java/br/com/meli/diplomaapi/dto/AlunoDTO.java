package br.com.meli.diplomaapi.dto;

import br.com.meli.diplomaapi.entity.Aluno;
import br.com.meli.diplomaapi.entity.Disciplina;
import br.com.meli.diplomaapi.model.AlunoModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AlunoDTO {
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    // contructor

    public AlunoDTO(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public static AlunoDTO converte(Aluno aluno) {
        return new AlunoDTO(aluno.getNome(), aluno.getDisciplinas());
    }

    public static Aluno converte(AlunoDTO alunoDTO, AlunoModel alunoModel) {
        return new Aluno(alunoModel.getAll().size() + 1, alunoDTO.getNome(), alunoDTO.getDisciplinas());
    }

    public static List<AlunoDTO> converte(List<Aluno> alunos) {
        return alunos.stream().map(a -> new AlunoDTO(a.getNome(), a.getDisciplinas())).collect(Collectors.toList());
    }

    public Double getMedia() {
        Double media = disciplinas.stream().mapToDouble(d -> d.getNota()).average().getAsDouble();
        return media;
    }

    public String getMessage() {
        if (getMedia() > 9) {
            return "Parabéns";
        }
        return "";
    }

    // getters and setters

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
}
