package br.com.meli.diplomaapi.dto;

import br.com.meli.diplomaapi.entity.Aluno;
import br.com.meli.diplomaapi.entity.Disciplina;
import br.com.meli.diplomaapi.repository.AlunoRepository;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Validated
public class AlunoDTO {

    @NotBlank(message = "O campo nome é obrigatório")
    @Size(min = 8, max = 50, message = "O campo nome deve ter entre 8 e 50 caracteres")
    @Pattern(regexp = "[A-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+", message = "O campo nome deve possuir apenas letras")
    private String nome;

    @Valid
    @NotNull(message = "O campo disciplinas é obrigatorio")
    private List<Disciplina> disciplinas;

    private String message;
    private double media;

    // constructor

    public AlunoDTO(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    // DTO methods


    public static AlunoDTO converte(Aluno aluno) {
        return new AlunoDTO(aluno.getNome(), aluno.getDisciplinas());
    }

    public static Aluno converte(AlunoDTO alunoDTO, AlunoRepository alunoRepository) {
        int sizeOfList = alunoRepository.getAll().size();
        int id = 1;
        if (sizeOfList > 0) {
            id = alunoRepository.getAll().get(sizeOfList - 1).getId() + 1;
        }
        return new Aluno(id, alunoDTO.getNome(), alunoDTO.getDisciplinas());
    }

    public static List<AlunoDTO> converte(List<Aluno> alunos) {
        return alunos.stream().map(a -> new AlunoDTO(a.getNome(), a.getDisciplinas())).collect(Collectors.toList());
    }

    public double getMedia() {
        double media = disciplinas.stream().mapToDouble(d -> d.getNota()).average().getAsDouble();
        return media;
    }

    public String getMessage() {
        return "Diploma gerado com sucesso! Sua média foi " + getMedia();
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
