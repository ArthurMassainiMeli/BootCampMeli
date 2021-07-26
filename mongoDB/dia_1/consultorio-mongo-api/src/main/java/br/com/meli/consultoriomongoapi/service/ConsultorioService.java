package br.com.meli.consultoriomongoapi.service;

import br.com.meli.consultoriomongoapi.domain.Consulta;
import br.com.meli.consultoriomongoapi.repository.ConsultorioRepository;
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

    public List<Consulta> findAll() {
        return consultorioRepository.findAll();
    }

    public List<Consulta> findByDoctorName(String firstName) {
        List<Consulta> consultas = consultorioRepository.findConsultasByDoctorFirstName(firstName);

        if (consultas.isEmpty()) {
            throw new NoSuchElementException("Dentista não encontrado");
        }
        return consultas;
    }

    public void createConsulta(Consulta consulta) {
        consultorioRepository.save(consulta);
    }

    public void updateConsulta(Consulta consulta, String id) {
        consultorioRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("Consulta não encontrada"));

        consulta.setId(id);
        consultorioRepository.save(consulta);
    }

    public void deleteConsulta(String id) {
        consultorioRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("Consulta não encontrada"));

        consultorioRepository.deleteById(id);
    }
}
