package br.com.meli.consultoriomongoapi.repository;

import br.com.meli.consultoriomongoapi.domain.Consultas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultorioRepository extends MongoRepository<Consultas, String> {

    public List<Consultas> findConsultasByDoctorFirstName(String firstName);
}
