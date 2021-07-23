package br.com.meli.consultorioapijpa.controller;

import br.com.meli.consultorioapijpa.dto.TurnDTO;
import br.com.meli.consultorioapijpa.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/turns")
public class TurnController {

    private final TurnService turnService;

    @Autowired
    public TurnController(TurnService turnService) {
        this.turnService = turnService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody TurnDTO turnDTO) {
        turnService.create(turnDTO);
    }
}
