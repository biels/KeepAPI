package com.biel.keep.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Note {
	
	@JsonIgnore
	@ManyToOne
	private Account account;
	
	@Id
	@GeneratedValue
	private Long id;
	
	public String text;
	public boolean favorited;
	public boolean checked;
	public Date creationDate;
	public Date updateDate;
	
	public Note(Account account, String text, boolean favorited, boolean checked, Date creationDate, Date updateDate) {
		super();
		this.account = account;
		this.text = text;
		this.favorited = favorited;
		this.checked = checked;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
	}

	public Account getAccount() {
		return account;
	}

	public Long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public boolean isChecked() {
		return checked;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}
	
	
	
	

}
