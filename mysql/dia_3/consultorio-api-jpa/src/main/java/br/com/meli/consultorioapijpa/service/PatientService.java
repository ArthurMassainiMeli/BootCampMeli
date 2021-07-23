package br.com.meli.consultorioapijpa.service;

import br.com.meli.consultorioapijpa.entity.Patient;
import br.com.meli.consultorioapijpa.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void create(Patient patient) {
        patientRepository.save(patient);
    }

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}
