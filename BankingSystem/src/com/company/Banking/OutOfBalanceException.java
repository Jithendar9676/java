package com.company.Banking;

public class OutOfBalanceException extends  Exception{
    private double currentBalance;
    private double withDrawAmount;

    public OutOfBalanceException(double currentBalance,double withDrawAmount){
        this.currentBalance=currentBalance;
        this.withDrawAmount=withDrawAmount;
    }
    public OutOfBalanceException(double currentBalance){
        this.currentBalance=currentBalance;
    }
    public String getMessage(){
        return currentBalance  + "";
    }
}
