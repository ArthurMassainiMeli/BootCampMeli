package br.com.meli.diplomaapi.controller;

import br.com.meli.diplomaapi.dto.AlunoDTO;
import br.com.meli.diplomaapi.entity.Aluno;
import br.com.meli.diplomaapi.entity.Disciplina;
import br.com.meli.diplomaapi.service.AlunoService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class AlunoControllerTest {

    @InjectMocks
    private AlunoController alunoController;
    @Mock
    private AlunoService alunoServiceMock;

    @BeforeEach
    void setUp() {
        List<Aluno> alunos = Collections.singletonList(createValidAluno());

        Mockito.when(alunoServiceMock.getAll()).thenReturn(alunos);
    }


    @Test
    @DisplayName("Retorna uma lista de alunos aprovados e com diploma")
    void list_DeveRetornarAListaDeTodosOsAlunosComDiploma() {
        String expectedNome = createValidAluno().getNome();

        List<AlunoDTO> alunos = alunoController.getAllAlunos();


        Assertions.assertNotNull(alunos);
        Assertions.assertEquals(alunos.size(), 1);
        Assertions.assertEquals(alunos.get(0).getNome(), expectedNome);
    }


    public Aluno createValidAluno() {
        return new Aluno(
                1,
                "Arthur Massaini",
                List.of(
                        new Disciplina("Matematica basica", 10),
                        new Disciplina("Historia do brasil", 8)
                ));
    }
}