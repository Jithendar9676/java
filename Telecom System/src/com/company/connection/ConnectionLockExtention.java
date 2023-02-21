package com.company.connection;

public class ConnectionLockExtention extends  Exception{
    private double currentBalance;
    public ConnectionLockExtention(double currentBalance){
        this.currentBalance=currentBalance;
    }
    public String getMessage(){
        return currentBalance + "";
    }
}
