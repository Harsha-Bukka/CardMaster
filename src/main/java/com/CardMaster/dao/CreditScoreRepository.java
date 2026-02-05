package com.CardMaster.dao;

import com.CardMaster.model.CreditScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditScoreRepository extends JpaRepository<CreditScore, Long> {
    CreditScore findByApplication_ApplicationId(Long applicationId);
}
