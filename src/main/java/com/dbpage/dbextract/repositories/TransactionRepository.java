package com.dbpage.dbextract.repositories;

import com.dbpage.dbextract.entity.Historictransaction;
import com.dbpage.dbextract.entity.HistorictransactionKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Historictransaction, HistorictransactionKey> {
}
