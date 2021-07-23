package br.com.meli.consultorioapijpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "turns")
public class Turn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_turn")
    private Integer idTurn;

    @ManyToOne
    @JoinColumn(name = "id_diary")
    @JsonIgnore
    private Diary diary;

    @ManyToOne
    @JoinColumn(name = "id_turn_status")
    @JsonIgnore
    private TurnStatus turnStatus;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    @JsonIgnore
    private Patient patient;

    // constructors

    public Turn(Diary diary, TurnStatus turnStatus, Patient patient) {
        this.diary = diary;
        this.turnStatus = turnStatus;
        this.patient = patient;
    }

    public Turn() {

    }

    // getters and setters

    public Integer getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(Integer idTurn) {
        this.idTurn = idTurn;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    public TurnStatus getTurnStatus() {
        return turnStatus;
    }

    public void setTurnStatus(TurnStatus turnStatus) {
        this.turnStatus = turnStatus;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
