package br.com.meli.consultorioapijpa.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "diarys")
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diary")
    private Integer idDiary;

    @Column(name = "start_time")
    @JsonAlias("start_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate startTime;

    @Column(name = "ending_time")
    @JsonAlias("ending_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate endingTime;

    @ManyToOne
    @JoinColumn(name = "id_dentist")
    @JsonIgnore
    private Dentist dentist;


    // constructors

    public Diary(LocalDate startTime, LocalDate endingTime, Dentist dentist) {
        this.startTime = startTime;
        this.endingTime = endingTime;
        this.dentist = dentist;
    }

    public Diary() {
    }

    // getters and setters

    public Integer getIdDiary() {
        return idDiary;
    }

    public void setIdDiary(Integer idDiary) {
        this.idDiary = idDiary;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(LocalDate endingTime) {
        this.endingTime = endingTime;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }
}
