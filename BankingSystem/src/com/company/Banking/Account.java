package com.company.Banking;

public abstract class Account {
    private int accountId;
    private int customerId;
    private double balance;

    public Account(int accountId, int customerId, double balance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public abstract double deposit(double amount);

    public abstract double withdraw(double amount);
}