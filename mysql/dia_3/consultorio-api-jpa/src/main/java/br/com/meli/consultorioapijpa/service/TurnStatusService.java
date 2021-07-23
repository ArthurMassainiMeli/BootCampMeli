package br.com.meli.consultorioapijpa.service;

import br.com.meli.consultorioapijpa.entity.TurnStatus;
import br.com.meli.consultorioapijpa.repository.TurnStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnStatusService {
    private final TurnStatusRepository turnStatusRepository;

    @Autowired
    TurnStatusService(TurnStatusRepository turnStatusRepository) {
        this.turnStatusRepository = turnStatusRepository;
    }

    public void create(TurnStatus turnStatus) {
        turnStatusRepository.save(turnStatus);
    }
}
