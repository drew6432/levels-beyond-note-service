package com.codingAssessment.myapplication.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public NoteDTO findById(@PathVariable("id") Long id) {
        NoteDTO noteDTO = noteService.findById(id);
        return noteDTO;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public NoteDTO create(@RequestBody @Valid NoteDTO noteDTO) {
        return noteService.create(noteDTO);
    }
}


