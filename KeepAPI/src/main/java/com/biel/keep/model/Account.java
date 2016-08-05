package com.biel.keep.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private Long id;
	
	public String username;
	@JsonIgnore
	public String password;
	
	@OneToMany(mappedBy = "account")
	private Set<Note> notes = new HashSet<Note>();
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	Account() {
		// JPA ?
	}

	public Set<Note> getNotes(){
		return notes;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	
	

}
