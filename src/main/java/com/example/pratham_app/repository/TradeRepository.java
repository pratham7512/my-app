package com.example.pratham_app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.bond_tracking.model.Trade;

public interface TradeRepository extends JpaRepository<Trade, Long>{
	List<Trade> findByStatus(String status);
    List<Trade> findBySettlementDateBetween(LocalDate start, LocalDate end);
}
