package com.cts.dao;

import com.cts.model.RiskAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RiskAlertRepository extends JpaRepository<RiskAlert, Long> {
    List<RiskAlert> findByStatus(String status);
    List<RiskAlert> findBySeverity(String severity);
}
