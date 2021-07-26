package br.com.meli.consultoriomongoapi.repository;

import br.com.meli.consultoriomongoapi.domain.Consulta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultorioRepository extends MongoRepository<Consulta, String> {

    public List<Consulta> findConsultasByDoctorFirstName(String firstName);
}
