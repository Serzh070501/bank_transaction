package com.exam_project.bnak_transaction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;


@Entity
//@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue
    private Long transactionId;
    //@Column(name = "accountNumber")
    private String accountNumber;
    //@Column(name = "transactionAmount")
    private long transactionAmount;
    //@Column(name = "transactionDateTime")
    private Timestamp transactionDateTime;

    public Transaction(Long transactionId, String accountNumber, long transactionAmount, Timestamp transactionDateTime) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
        this.transactionDateTime = transactionDateTime;
    }

    public Transaction() {
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(long transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Timestamp getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(Timestamp transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }
}
