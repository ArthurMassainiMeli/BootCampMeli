package br.com.meli.consultorioapijpa.service;

import br.com.meli.consultorioapijpa.entity.Dentist;
import br.com.meli.consultorioapijpa.repository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistService {

    private final DentistRepository dentistRepository;

    @Autowired
    public DentistService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    public void create(Dentist dentist) {
        dentistRepository.save(dentist);
    }

    public List<Dentist> findAll(){
        return dentistRepository.findAll();
    }
}
