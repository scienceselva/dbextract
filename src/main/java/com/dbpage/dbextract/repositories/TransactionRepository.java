package com.dbpage.dbextract.repositories;

import com.dbpage.dbextract.entity.Historictransaction;
import com.dbpage.dbextract.entity.HistorictransactionKey;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Historictransaction, HistorictransactionKey> {
/*
    @Query(value = "SELECT f FROM Historictransaction f LEFT JOIN f.Transactionnarrative s ON f.narrativeId = s.narrativeId" +
            " WHERE f.customerKey = :customerKey" +
            " AND f.currency = :currency" +
            " AND f.suffix = :suffix")
*/
    @Query(
            value = "SELECT f.* FROM TRANSACTION f LEFT JOIN NARRATIVE s ON f.NARRATIVE_ID= s.NARRATIVE_ID WHERE f.CUSTOMER_KEY= :customerKey AND f.CURRENCY= :currency AND f.SUFFIX = :suffix ",
            countQuery = "SELECT COUNT(*) FROM TRANSACTION f LEFT JOIN NARRATIVE s ON f.NARRATIVE_ID= s.NARRATIVE_ID WHERE f.CUSTOMER_KEY= :customerKey AND f.CURRENCY= :currency AND f.SUFFIX = :suffix ",
            nativeQuery = true)
    List<Historictransaction> findByCustomerKey(@Param("customerKey") String customerKey,
                                                @Param("currency") String currency,
                                                @Param("suffix") String suffix,
                                                Pageable pageable);


}
