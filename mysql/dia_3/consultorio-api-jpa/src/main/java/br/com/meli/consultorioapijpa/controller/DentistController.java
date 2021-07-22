package br.com.meli.consultorioapijpa.controller;

import br.com.meli.consultorioapijpa.entity.Dentist;
import br.com.meli.consultorioapijpa.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dentists")
public class DentistController {

    private final DentistService dentistService;

    @Autowired
    public DentistController(DentistService dentistService) {
        this.dentistService = dentistService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Dentist dentist) {
        dentistService.create(dentist);
    }
}

