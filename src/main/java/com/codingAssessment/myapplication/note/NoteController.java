package com.codingAssessment.myapplication.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


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

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public NoteDTO delete(@PathVariable("id") Long id) {
        NoteDTO deleted = noteService.delete(id);
        return deleted;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<NoteDTO> findAll(@RequestParam(value="body", required=false) Optional<String> searchString) {
        List<NoteDTO> todoEntries = noteService.findAll(searchString);
        return todoEntries;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    NoteDTO update(@RequestBody @Valid NoteDTO updatedTodoEntry) {
        NoteDTO updated = noteService.update(updatedTodoEntry);
        return updated;
    }
}


