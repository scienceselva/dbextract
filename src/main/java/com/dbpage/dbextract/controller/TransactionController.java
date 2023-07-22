package com.dbpage.dbextract.controller;

import com.dbpage.dbextract.dto.Addnarrative;
import com.dbpage.dbextract.dto.Addtransaction;
import com.dbpage.dbextract.entity.Historictransaction;
import com.dbpage.dbextract.entity.Transactionnarrative;
import com.dbpage.dbextract.repositories.NarrativeRepository;
import com.dbpage.dbextract.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private NarrativeRepository narrativeRepository;

    @PostMapping("/add-t")
    public Historictransaction addTransaction(@RequestBody Addtransaction addtransaction) {
        return transactionRepository.save(addtransaction.getHistorictransaction());
    }
    @PostMapping("/add-n")
    public Transactionnarrative addNarrative(@RequestBody Addnarrative addnarrative) {
        return narrativeRepository.save(addnarrative.getTransactionnarrative());
    }

    @GetMapping("/test")
    public String Heartbeat(){
        return "Its working ....!";
    }
    //public
}
