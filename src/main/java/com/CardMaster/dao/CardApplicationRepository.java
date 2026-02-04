package com.CardMaster.dao;
import com.CardMaster.model.CardApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardApplicationRepository extends JpaRepository<CardApplication, Long> {
}