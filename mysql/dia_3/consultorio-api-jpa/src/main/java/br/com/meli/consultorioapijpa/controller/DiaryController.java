package br.com.meli.consultorioapijpa.controller;

import br.com.meli.consultorioapijpa.dto.DiaryDTO;
import br.com.meli.consultorioapijpa.entity.Diary;
import br.com.meli.consultorioapijpa.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diarys")
public class DiaryController {

    private final DiaryService diaryService;

    @Autowired
    DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody DiaryDTO diaryDTO){
        diaryService.create(diaryDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DiaryDTO> findAll(){
        return diaryService.findAll();
    }
}
