package com.exam_project.bnak_transaction.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
//@Table (name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(name = "account_amount")
    private double amount;


    protected Account() {}

    public Account(double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
