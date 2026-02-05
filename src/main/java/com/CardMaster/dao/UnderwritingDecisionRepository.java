package com.CardMaster.dao;

import com.CardMaster.model.UnderwritingDecision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnderwritingDecisionRepository extends JpaRepository<UnderwritingDecision, Long> {
    UnderwritingDecision findByApplication_ApplicationId(Long applicationId);
}
