package br.com.meli.consultorioapijpa.controller;

import br.com.meli.consultorioapijpa.entity.TurnStatus;
import br.com.meli.consultorioapijpa.service.TurnStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class TurnStatusController {

    private final TurnStatusService turnStatusService;

    @Autowired
    TurnStatusController(TurnStatusService turnStatusService) {
        this.turnStatusService = turnStatusService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody TurnStatus turnStatus) {
        turnStatusService.create(turnStatus);
    }
}
