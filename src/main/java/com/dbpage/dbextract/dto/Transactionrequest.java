package com.dbpage.dbextract.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transactionrequest {
    String customerKey;
    String currency;
    String suffix;
}
