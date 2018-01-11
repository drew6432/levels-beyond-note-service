package com.codingAssessment.myapplication.note;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

    @Transactional
    @Override
    public NoteDTO delete(Long id) {
        Note deleted = findTodoEntryById(id);
        repository.delete(deleted);
        return NoteMapper.mapEntityToDTO(deleted);
    }

    @Transactional(readOnly = true)
    @Override
    public List<NoteDTO> findAll(Optional<String> opt) {
        List<Note> todoEntries;

        todoEntries = opt.map(repository::findByBodyContaining).orElseGet(repository::findAll);

        return NoteMapper.mapEntitiesIntoDTOs(todoEntries);
    }

    @Transactional(readOnly = true)
    @Override
    public NoteDTO findById(Long id) {
        Note todoEntry = findTodoEntryById(id);
        return NoteMapper.mapEntityToDTO(todoEntry);
    }

    @Transactional
    @Override
    public NoteDTO update(NoteDTO updatedNote) {
        Note updated = findTodoEntryById(updatedNote.getId());
        updated.setBody(updatedNote.getBody());

        repository.flush();
        return NoteMapper.mapEntityToDTO(updated);
    }

    private Note findTodoEntryById(Long id) {
        Optional<Note> todoResult = repository.findOne(id);
        return todoResult.orElseThrow(() -> new NoteNotFoundException(id));
    }

}
