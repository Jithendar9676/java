package com.company.teatre;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre =new Theatre("PVR",10,15);
       // theatre.getSeat();
        if (theatre.reserveSeat("A10")){
            System.out.println("Please pay : RS 150 ");
        }else {
            System.out.println("Sorry, set is already Reserved");
        }

    }
}
