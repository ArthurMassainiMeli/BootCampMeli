package br.com.meli.consultorioapijpa.repository;

import br.com.meli.consultorioapijpa.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
