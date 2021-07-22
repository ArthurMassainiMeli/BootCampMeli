package br.com.meli.consultorioapijpa.service;

import br.com.meli.consultorioapijpa.dto.DiaryDTO;
import br.com.meli.consultorioapijpa.entity.Dentist;
import br.com.meli.consultorioapijpa.entity.Diary;
import br.com.meli.consultorioapijpa.repository.DentistRepository;
import br.com.meli.consultorioapijpa.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class DiaryService {

    private final DiaryRepository diaryRepository;
    private final DentistRepository dentistRepository;

    @Autowired
    public DiaryService(DiaryRepository diaryRepository, DentistRepository dentistRepository) {
        this.diaryRepository = diaryRepository;
        this.dentistRepository = dentistRepository;
    }

    public void create(DiaryDTO diaryDTO) {
        Dentist dentist = dentistRepository
                .findById(diaryDTO.getDentistId())
                .orElseThrow(() -> new NoSuchElementException("Dentista nao encontrado"));

        Diary diary = diaryDTO.converte(diaryDTO, dentist);
        diaryRepository.save(diary);
    }
}
