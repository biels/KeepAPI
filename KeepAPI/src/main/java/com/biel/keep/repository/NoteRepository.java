package com.biel.keep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biel.keep.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
