package com.exam_project.bnak_transaction.enums;

public enum TransactionType {

    DEPOSIT(1), WITHDRAWAL(2);
    int id;

    private TransactionType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
