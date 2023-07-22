package com.dbpage.dbextract.dto;

import com.dbpage.dbextract.entity.Historictransaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Addtransaction {
    private Historictransaction historictransaction;
}
