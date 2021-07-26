package br.com.meli.consultoriomongoapi.controller;

import br.com.meli.consultoriomongoapi.domain.Consulta;
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
    public List<Consulta> findAll() {
        return consultorioService.findAll();
    }

    @GetMapping("/{firstName}")
    @ResponseStatus(HttpStatus.OK)
    public List<Consulta> findByDoctorName(@PathVariable String firstName) {
        return consultorioService.findByDoctorName(firstName);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createConsulta(@RequestBody Consulta consulta) {
        consultorioService.createConsulta(consulta);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateConsulta(@RequestBody Consulta consulta, @PathVariable String id) {
        consultorioService.updateConsulta(consulta, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConsulta(@PathVariable String id) {
        consultorioService.deleteConsulta(id);
    }
}
