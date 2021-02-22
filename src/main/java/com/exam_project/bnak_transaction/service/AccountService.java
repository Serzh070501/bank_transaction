package com.exam_project.bnak_transaction.service;

import com.exam_project.bnak_transaction.model.Account;
import com.exam_project.bnak_transaction.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AccountService {
    List<Account> findAll();
    Account save(Account account);

}
