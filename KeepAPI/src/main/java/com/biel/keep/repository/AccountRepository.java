package com.biel.keep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biel.keep.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
