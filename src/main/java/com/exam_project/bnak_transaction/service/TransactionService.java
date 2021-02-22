package com.exam_project.bnak_transaction.service;

import com.exam_project.bnak_transaction.model.Transaction;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

@Service
public interface TransactionService {
    public Transaction sendMoney(String fromAccountNumber, String toAccountNumber, long amount) ;
}
