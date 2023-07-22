package com.dbpage.dbextract.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "NARRATIVE")
//@IdClass(TransactionnarrativeKey.class)
public class Transactionnarrative {
    /*
    @Id
    Integer narrativeId;
    @Id
    Integer sequenceNumber;
*/
    @EmbeddedId
    private TransactionnarrativeKey transactionnarrativeKey;
    String narrativeDescription;
}
