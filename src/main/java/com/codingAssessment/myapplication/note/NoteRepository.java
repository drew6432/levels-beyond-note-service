package com.codingAssessment.myapplication.note;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface NoteRepository extends Repository<Note, Long> {

    void delete(Note deleted);

    List<Note> findAll();

    Optional<Note> findOne(Long id);

    Note save(Note persisted);
}
