package com.exam_project.bnak_transaction.service.impl;

import com.exam_project.bank_transaction.controller.request.TransferBalanceRequest;
import com.exam_project.bank_transaction.model.Account;
import com.exam_project.bank_transaction.model.AccountStatement;
import com.exam_project.bank_transaction.repository.AccountRepository;
import com.exam_project.bank_transaction.repository.TransactionRepository;
import com.exam_project.bank_transaction.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transaction;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {


    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public Transaction sendMoney(TransferBalanceRequest transferBalanceRequest) {
        return null;
    }

    @Override
    public AccountStatement getStatement(String accountNumber) {
        return null;
    }
}