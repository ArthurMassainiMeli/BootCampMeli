package br.com.meli.diplomaapi.service;

import br.com.meli.diplomaapi.dto.AlunoDTO;
import br.com.meli.diplomaapi.entity.Aluno;
import br.com.meli.diplomaapi.exception.ExceptionNotApproved;
import br.com.meli.diplomaapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    @Autowired
    AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> getAll() {
        return alunoRepository.getAll();
    }

    public AlunoDTO insertOne(AlunoDTO alunoDTO) {
        if (alunoDTO.getMedia() < 6.00) {
            throw new ExceptionNotApproved("Aluno inserido não aprovado para receber seu diploma");
        }

        Aluno aluno = AlunoDTO.converte(alunoDTO, alunoRepository);
        return AlunoDTO.converte(alunoRepository.insertOne(aluno));
    }

    public Aluno getById(int id) {
        return alunoRepository.getById(id);
    }
}
