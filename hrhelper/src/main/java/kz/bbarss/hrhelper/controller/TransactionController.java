package kz.bbarss.hrhelper.controller;

import kz.bbarss.hrhelper.db.entity.Transaction;
import kz.bbarss.hrhelper.db.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping("/createTransaction")
    public void addComment(@RequestBody Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @GetMapping("/{userId}/transactions")
    public List<Transaction> getUserComments(@PathVariable String userId) {
        return transactionRepository.findByAuthorIdOrTargetId(userId);
    }
}
