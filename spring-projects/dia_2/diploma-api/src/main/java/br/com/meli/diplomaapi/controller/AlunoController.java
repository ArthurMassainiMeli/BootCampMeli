package br.com.meli.diplomaapi.controller;

import br.com.meli.diplomaapi.dto.AlunoDTO;
import br.com.meli.diplomaapi.entity.Aluno;
import br.com.meli.diplomaapi.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @Autowired
    AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoDTO createAluno(@Valid @RequestBody AlunoDTO alunoDTO) {
        return alunoService.insertOne(alunoDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AlunoDTO getAlunoById(@PathVariable int id) {
        Aluno aluno = alunoService.getById(id);
        AlunoDTO alunoDTO = AlunoDTO.converte(aluno);
        return alunoDTO;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<AlunoDTO> getAllAlunos() {
        List<Aluno> alunos = alunoService.getAll();
        List<AlunoDTO> alunosDTO = AlunoDTO.converte(alunos);
        return alunosDTO;
    }
}
