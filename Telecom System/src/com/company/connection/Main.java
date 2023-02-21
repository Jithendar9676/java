package com.company.connection;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Invertory in =new Invertory();
        Connection c1=new Perpaid(1,1,100);
        Connection c2=new Perpaid(2,1,100);
        Connection c3=new Perpaid(3,2,100);

        System.out.println(in.addConnection(c1));
        System.out.println(in.addConnection(c3));
        System.out.println(in.addConnection(c2));

        System.out.println(in.recharge(1,200));
        try {
            System.out.println(in.deduct(1, 200));
            System.out.println(in.deduct(1, 200));
            System.out.println(in.deduct(1, 200));
        }catch (ConnectionLockExtention e){
            System.out.println(e.getMessage());
        }
        Set<Integer> ids=in.getUniqueCustomerIds();
        for (Integer i: ids) {
            System.out.println(i);
        }
    }
}
