package br.com.meli.consultorioapijpa.dto;

import br.com.meli.consultorioapijpa.entity.Dentist;
import br.com.meli.consultorioapijpa.entity.Diary;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class DiaryDTO {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @JsonAlias("start_time")
    private LocalDate startTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @JsonAlias("ending_time")
    private LocalDate endingTime;

    @JsonAlias("id_dentist")
    private Integer dentistId;

    // DTO methods

    public static Diary converte(DiaryDTO diaryDTO, Dentist dentist) {
        return new Diary(diaryDTO.getStartTime(), diaryDTO.getEndingTime(), dentist);
    }

    public static DiaryDTO converte(Diary diary) {
        return new DiaryDTO(diary.getStartTime(), diary.getEndingTime(), diary.getDentist().getIdDestist());
    }

    public static List<DiaryDTO> converte(List<Diary> diarys) {
        return diarys.stream()
                .map(DiaryDTO::converte)
                .collect(Collectors.toList());
    }

    // constructor

    public DiaryDTO(LocalDate startTime, LocalDate endingTime, Integer dentistId) {
        this.startTime = startTime;
        this.endingTime = endingTime;
        this.dentistId = dentistId;
    }

    // getters and setters

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

    public Integer getDentistId() {
        return dentistId;
    }

    public void setDentistId(Integer dentistId) {
        this.dentistId = dentistId;
    }
}
