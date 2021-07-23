package br.com.meli.consultorioapijpa.dto;

import br.com.meli.consultorioapijpa.entity.Diary;
import br.com.meli.consultorioapijpa.entity.Patient;
import br.com.meli.consultorioapijpa.entity.Turn;
import br.com.meli.consultorioapijpa.entity.TurnStatus;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;
import java.util.stream.Collectors;

public class TurnDTO {
    @JsonAlias("id_diary")
    private Integer idDiary;

    @JsonAlias("id_turn_status")
    private Integer idTurnStatus;

    @JsonAlias("id_patient")
    private Integer idPatient;

    // DTO methods

    public static Turn convert(Diary diary, TurnStatus turnStatus, Patient patient) {
        return new Turn(diary, turnStatus, patient);
    }

    public static TurnDTO convert(Turn turn) {
        return new TurnDTO(
                turn.getDiary().getIdDiary(),
                turn.getTurnStatus().getIdTurnStatus(),
                turn.getPatient().getIdPatient()
        );
    }

    public static List<TurnDTO> convert(List<Turn> turns) {
        return turns.stream()
                .map(TurnDTO::convert)
                .collect(Collectors.toList());
    }


    // constructors

    public TurnDTO(Integer idDiary, Integer idTurnStatus, Integer idPatient) {
        this.idDiary = idDiary;
        this.idTurnStatus = idTurnStatus;
        this.idPatient = idPatient;
    }

    public TurnDTO() {

    }

    // getters and setters

    public Integer getIdDiary() {
        return idDiary;
    }

    public void setIdDiary(Integer idDiary) {
        this.idDiary = idDiary;
    }

    public Integer getIdTurnStatus() {
        return idTurnStatus;
    }

    public void setIdTurnStatus(Integer idTurnStatus) {
        this.idTurnStatus = idTurnStatus;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }
}
