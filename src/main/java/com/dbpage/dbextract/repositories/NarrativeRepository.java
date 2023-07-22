package com.dbpage.dbextract.repositories;

import com.dbpage.dbextract.entity.Transactionnarrative;
import com.dbpage.dbextract.entity.TransactionnarrativeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NarrativeRepository extends JpaRepository<Transactionnarrative, TransactionnarrativeKey> {
}
