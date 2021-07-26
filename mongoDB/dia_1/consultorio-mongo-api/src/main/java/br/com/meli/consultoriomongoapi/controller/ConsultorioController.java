package br.com.meli.consultoriomongoapi.controller;

import br.com.meli.consultoriomongoapi.domain.Consultas;
import br.com.meli.consultoriomongoapi.service.ConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultorio")
public class ConsultorioController {

    private final ConsultorioService consultorioService;

    @Autowired
    public ConsultorioController(ConsultorioService consultorioService) {
        this.consultorioService = consultorioService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Consultas> findAll() {
        return consultorioService.findAll();
    }

    @GetMapping("/{firstName}")
    @ResponseStatus(HttpStatus.OK)
    public List<Consultas> findByDoctorName(@PathVariable String firstName) {
        return consultorioService.findByDoctorName(firstName);
    }
}
