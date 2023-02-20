package com.company.Banking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Bank {
  private   ArrayList<Account> accounts=new ArrayList<Account>();

    public Bank() {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    public boolean addAcount(Account obj){
        boolean code=true;
        for (Account a:accounts) {
            if (a.getAccountId()== obj.getAccountId()){
                code=false;
                break;
            }
        }
        if (code==true){
            accounts.add(obj);
        }
        return code;
    }
    public double deposit(int id , double amount){
        double count = -1;
        for (Account a:accounts) {
            if (a.getAccountId()==id){
                count=a.deposit(amount);
                break;
            }
        }
        return count;
    }
    public double withdraw(int id , double amount)throws OutOfBalanceException{
        double count=-1;
        for (Account a:accounts){
            if (a.getAccountId()==id){
                double balance=a.getBalance();
                if (balance>=amount){
                    count=a.withdraw(amount);
                }
                else {
                    throw new OutOfBalanceException(balance);
                }
            }
        }
        return count;
    }
    public Set<Integer> getUniqueCustomerids(){
        Set<Integer> ids=new HashSet<Integer>();
        for (Account a:accounts) {
            ids.add(a.getCustomerId());
        }
        return ids;
    }
    public HashMap<Integer,Account>getAccountHashMap(){
        HashMap<Integer,Account>myMap=new HashMap<Integer,Account>();
        for (Account a:accounts) {
            myMap.put(a.getAccountId(),a);
        }
        return myMap;
    }
}
