package com.dbpage.dbextract.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "TRANSACTION")
//@IdClass(HistorictransactionKey.class)

public class Historictransaction {
    /*
    @Id
    String customerKey;
    @Id
    String currency;
    @Id
    String suffix;
    */

    @EmbeddedId
    private HistorictransactionKey historictransactionKey;
    String valueDate;
    String postedDate;
    Integer narrativeId;
    Integer transactionAmount;
/*
    @OneToMany(targetEntity = Historictransaction.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "narrativeId",referencedColumnName = "narrativeId")
    private List<Transactionnarrative> transactionnarrativeList;
*/
    @OneToMany
    @JoinColumn(name = "narrativeId", referencedColumnName = "narrativeId")
    private List<Transactionnarrative> transactionnarrativeList;
}
