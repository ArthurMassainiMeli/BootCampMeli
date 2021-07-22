package br.com.meli.consultorioapijpa.repository;

import br.com.meli.consultorioapijpa.entity.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Integer> {
}
