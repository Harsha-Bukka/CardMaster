package com.cts.dao;

import com.cts.model.RiskCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskCaseRepository extends JpaRepository<RiskCase, Long> {
    RiskCase findByAlert_AlertId(Long alertId);
}
