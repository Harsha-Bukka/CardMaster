package com.cts.dao;

import com.cts.model.PortfolioReport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PortfolioReportRepository extends JpaRepository<PortfolioReport, Long> {
    List<PortfolioReport> findByScope(String scope);
}
