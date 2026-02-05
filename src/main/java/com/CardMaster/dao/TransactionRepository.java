package com.CardMaster.dao;

import com.CardMaster.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {

    List<Transaction> findByTransactionStatus(String transactionStatus);

    List<Transaction> findByCard_CardNumber(String cardNumber);
}