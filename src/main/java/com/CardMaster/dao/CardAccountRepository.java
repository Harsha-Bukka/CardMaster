package com.CardMaster.dao;

import com.CardMaster.model.CardAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardAccountRepository
        extends JpaRepository<CardAccount, Long> {

    Optional<CardAccount> findByAccountNumber(String accountNumber);
}