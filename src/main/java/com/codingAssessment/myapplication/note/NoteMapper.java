package com.codingAssessment.myapplication.note;


import java.util.List;
import java.util.stream.Collectors;

final class NoteMapper {

    static Note mapDTOToEntity(NoteDTO dto) {
        if (dto == null) {
            return null;
        }
        Note noteEntity = new Note();
        noteEntity.setId(dto.getId());
        noteEntity.setBody(dto.getBody());

        return noteEntity;
    }

    static  NoteDTO mapEntityToDTO(Note noteEntity) {
        if (noteEntity == null) {
            return null;
        }
        NoteDTO dto = new NoteDTO();
        dto.setId(noteEntity.getId());
        dto.setBody(noteEntity.getBody());

        return dto;
    }

    static List<NoteDTO> mapEntitiesIntoDTOs(List<Note> noteEntities) {
        return noteEntities.stream().map(NoteMapper::mapEntityToDTO).collect(Collectors.toList());
    }
}
