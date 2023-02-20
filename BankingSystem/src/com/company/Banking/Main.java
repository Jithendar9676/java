package com.company.Banking;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank b=new Bank();
        Account a1=new SavingAccount(1,1,1000);
        Account a2=new SavingAccount(2,2,5000);
        Account a3=new SavingAccount(2,3,3000);

        System.out.println(b.addAcount(a1));
        System.out.println(b.addAcount(a2));
        System.out.println(b.addAcount(a3));

        System.out.println(b.deposit(1,500));
        try {
            System.out.println(b.withdraw(1, 500));
            System.out.println(b.withdraw(1, 500));
            System.out.println(b.withdraw(1, 520));
        }catch (OutOfBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
