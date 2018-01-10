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
//    @Autowired
//    private NoteMapper mapper;

//    @GET
//    @Path("/{id}")
//    public NoteDTO getNote(@PathParam("id") String id) {
////        log.info("Retrieving entity with id {}", id);
//        Note noteEntity = noteService.getNote(id);
//        NoteDTO noteDTO = mapper.mapToDto(noteEntity);
////        log.info("Entity with id {} retrieved successfully", id);
//        return noteDTO;
//    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public NoteDTO create(@RequestBody @Valid NoteDTO noteDTO) {
//        log.info("Retrieving entity with id {}", id);

        return noteService.create(noteDTO);
//        log.info("Entity with id {} retrieved successfully", id);
//        return noteDTO;
    }
}


