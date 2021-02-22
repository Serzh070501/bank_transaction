package com.exam_project.bnak_transaction.service.impl;

import com.exam_project.bnak_transaction.model.Account;
import com.exam_project.bnak_transaction.model.Transaction;
import com.exam_project.bnak_transaction.repository.AccountRepository;
import com.exam_project.bnak_transaction.repository.TransactionRepository;
import com.exam_project.bnak_transaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    TransactionRepository transactionRepository;


    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account save(Account account) {
        return null;
    }



}
