package com.exam_project.bank_transaction.service;

import com.exam_project.bank_transaction.controller.request.TransferBalanceRequest;
import com.exam_project.bank_transaction.model.Account;
import com.exam_project.bank_transaction.model.AccountStatement;
import org.springframework.stereotype.Service;

import javax.transaction.Transaction;
import java.util.List;
@Service
public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
    Transaction sendMoney(
            TransferBalanceRequest transferBalanceRequest
    );
    AccountStatement getStatement(String accountNumber);
}