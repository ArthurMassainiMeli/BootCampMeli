package br.com.meli.diplomaapi.controller;

import br.com.meli.diplomaapi.dto.AlunoDTO;
import br.com.meli.diplomaapi.entity.Aluno;
import br.com.meli.diplomaapi.model.AlunoModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private AlunoModel alunoModel = new AlunoModel();

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createAluno(@RequestBody AlunoDTO alunoDTO) {
        Aluno aluno = AlunoDTO.converte(alunoDTO, alunoModel);
        alunoModel.insertOne(aluno);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AlunoDTO getAlunoById(@PathVariable Integer id) {
        Aluno aluno = alunoModel.getById(id);
        AlunoDTO alunoDTO = AlunoDTO.converte(aluno);
        return alunoDTO;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<AlunoDTO> getAllAlunos() {
        List<Aluno> alunos = alunoModel.getAll();
        List<AlunoDTO> alunosDTO = AlunoDTO.converte(alunos);
        return alunosDTO;
    }
}
