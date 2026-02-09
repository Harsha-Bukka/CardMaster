package com.CardMaster.dao;

import com.CardMaster.model.Statement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatementRepository extends JpaRepository<Statement, Long> { }