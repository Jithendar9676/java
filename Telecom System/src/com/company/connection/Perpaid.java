package com.company.connection;

public class Perpaid extends Connection{
    public Perpaid(int connectionId, int customerId, double balance) {
        super(connectionId, customerId, balance);
    }

    public double recharge(double amount){
        double balance=getBalance();
        balance +=amount;
        setBalance(balance);
        return balance;
    }

    public double deduct(double amount){
        double balance=getBalance();
        balance -=amount;
        setBalance(balance);
        return balance;
    }
}
