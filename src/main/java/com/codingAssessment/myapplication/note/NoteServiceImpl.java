package com.codingAssessment.myapplication.note;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository repository;

    @Autowired
    NoteServiceImpl(NoteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public NoteDTO create(NoteDTO newNote) {
        Note created = new Note();
        created.setBody(newNote.getBody());
        created = repository.save(created);

        return NoteMapper.mapEntityToDTO(created);
    }

}
