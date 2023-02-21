package com.company.connection;

public abstract class Connection {
    private int connectionId;
    private int customerId;
    private double balance;

    public Connection(int connectionId, int customerId, double balance) {
        this.connectionId = connectionId;
        this.customerId = customerId;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public int getCustomerId() {
        return customerId;
    }
    public abstract double recharge(double amount);
    public abstract double deduct(double amount);
}
