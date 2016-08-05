package com.biel.keep.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biel.keep.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
	Collection<Note> findByAccountUsername(String username);
}
