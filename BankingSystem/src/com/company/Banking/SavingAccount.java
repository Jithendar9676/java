package com.company.Banking;

public class SavingAccount extends Account {
    public SavingAccount(int accountId, int customerId, double balance) {
        super(accountId, customerId, balance);
    }
    public double deposit(double amount){
        double balance=getBalance();
        balance +=amount;
        setBalance(balance);
        return balance;
    }
    public double withdraw(double amount) {
        double balance=getBalance();
        balance -=amount;
        setBalance(balance);
                return balance;
    }
}
