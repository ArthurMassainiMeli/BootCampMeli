package br.com.meli.consultorioapijpa.service;

import br.com.meli.consultorioapijpa.dto.TurnDTO;
import br.com.meli.consultorioapijpa.entity.Diary;
import br.com.meli.consultorioapijpa.entity.Patient;
import br.com.meli.consultorioapijpa.entity.Turn;
import br.com.meli.consultorioapijpa.entity.TurnStatus;
import br.com.meli.consultorioapijpa.repository.DiaryRepository;
import br.com.meli.consultorioapijpa.repository.PatientRepository;
import br.com.meli.consultorioapijpa.repository.TurnRepository;
import br.com.meli.consultorioapijpa.repository.TurnStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class TurnService {

    private final TurnRepository turnRepository;
    private final DiaryRepository diaryRepository;
    private final TurnStatusRepository turnStatusRepository;
    private final PatientRepository patientRepository;

    @Autowired
    public TurnService(TurnRepository turnRepository, DiaryRepository diaryRepository, TurnStatusRepository turnStatusRepository, PatientRepository patientRepository) {
        this.turnRepository = turnRepository;
        this.diaryRepository = diaryRepository;
        this.turnStatusRepository = turnStatusRepository;
        this.patientRepository = patientRepository;
    }


    public void create(TurnDTO turnDTO) {
        Diary diary = diaryRepository
                .findById(turnDTO.getIdDiary())
                .orElseThrow(() -> new NoSuchElementException("Agenda do medico nao disponível"));

        TurnStatus turnStatus = turnStatusRepository
                .findById(turnDTO.getIdTurnStatus())
                .orElseThrow(() -> new NoSuchElementException("Não existe status passado"));

        Patient patient = patientRepository
                .findById(turnDTO.getIdPatient())
                .orElseThrow(() -> new NoSuchElementException("Paciente nao encontrado"));

        Turn turn = TurnDTO.convert(diary, turnStatus, patient);
        turnRepository.save(turn);
    }
}
