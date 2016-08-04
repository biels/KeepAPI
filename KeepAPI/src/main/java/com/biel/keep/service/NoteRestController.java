package com.biel.keep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biel.keep.repository.AccountRepository;
import com.biel.keep.repository.NoteRepository;

@RestController
@RequestMapping("/{userId}/notes")
public class NoteRestController {
	private final AccountRepository accountRepository;
	private final NoteRepository noteRepository;
	
	@Autowired
	public NoteRestController(AccountRepository accountRepository, NoteRepository noteRepository) {
		super();
		this.accountRepository = accountRepository;
		this.noteRepository = noteRepository;
	}
	
	

}
