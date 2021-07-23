package br.com.meli.consultorioapijpa.controller;

import br.com.meli.consultorioapijpa.entity.Patient;
import br.com.meli.consultorioapijpa.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Patient patient) {
        patientService.create(patient);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findAll(){
        return patientService.findAll();
    }
}
