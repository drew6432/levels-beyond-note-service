package com.codingAssessment.myapplication.note;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


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

    @Transactional(readOnly = true)
    @Override
    public NoteDTO findById(Long id) {
        Note todoEntry = findTodoEntryById(id);
        return NoteMapper.mapEntityToDTO(todoEntry);
    }

    private Note findTodoEntryById(Long id) {
        Optional<Note> todoResult = repository.findOne(id);
        return todoResult.orElseThrow(() -> new NoteNotFoundException(id));
    }

}
