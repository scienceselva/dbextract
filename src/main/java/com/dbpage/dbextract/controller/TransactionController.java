package com.dbpage.dbextract.controller;

import com.dbpage.dbextract.entity.Historictransaction;
import com.dbpage.dbextract.repositories.NarrativeRepository;
import com.dbpage.dbextract.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private final TransactionRepository transactionRepository;
    @Autowired
    private NarrativeRepository narrativeRepository;
    @Autowired
    public TransactionController( TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    @GetMapping("/{customerKey}/{currency}/{suffix}")
    public ResponseEntity<List<Historictransaction>> getTransactionByKey(
            @PathVariable String customerKey,
            @PathVariable String currency,
            @PathVariable String suffix,
            @RequestParam (defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        List<Historictransaction> historictransactionList = transactionRepository.findByCustomerKey(customerKey, currency, suffix, pageable);

        return ResponseEntity.ok(historictransactionList);
    }


/*
    @PostMapping("/add-t")
    public Historictransaction addTransaction(@RequestBody Addtransaction addtransaction) {
        return transactionRepository.save(addtransaction.getHistorictransaction());
    }
    @PostMapping("/add-n")
    public Transactionnarrative addNarrative(@RequestBody Addnarrative addnarrative) {
        return narrativeRepository.save(addnarrative.getTransactionnarrative());
    }
*/
    @GetMapping("/test")
    public String Heartbeat(){
        return "Its working ....!";
    }
    //public


}
