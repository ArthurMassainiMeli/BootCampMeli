package br.com.meli.consultoriomongoapi.service;

import br.com.meli.consultoriomongoapi.domain.Consultas;
import br.com.meli.consultoriomongoapi.repository.ConsultorioRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ConsultorioService {

    private final ConsultorioRepository consultorioRepository;

    @Autowired
    public ConsultorioService(ConsultorioRepository consultorioRepository) {
        this.consultorioRepository = consultorioRepository;
    }

    public List<Consultas> findAll() {
        return consultorioRepository.findAll();
    }

    public List<Consultas> findByDoctorName(String firstName) {
        List<Consultas> consultas = consultorioRepository.findConsultasByDoctorFirstName(firstName);

        if (consultas.isEmpty()) {
            throw new NoSuchElementException("Dentista não encontrado");
        }
        return consultas;
    }
}
