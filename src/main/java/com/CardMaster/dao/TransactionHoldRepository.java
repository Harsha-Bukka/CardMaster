package com.CardMaster.dao;

import com.CardMaster.model.TransactionHold;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionHoldRepository
        extends JpaRepository<TransactionHold, Long> {

    List<TransactionHold> findByHoldStatus(String holdStatus);
}