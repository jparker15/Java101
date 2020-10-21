package com.careerdevs;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Car myCar = new Car("Black", "Volvo", "123", 1995);
//        System.out.println(myCar);
//        System.out.println(myCar.toString());
//        myCar.displayDetails();

        BankAccount myAcct = new BankAccount(100000, "Jar", "123", "CryptoWallet");
        CheckingAccount myChecking = new CheckingAccount(100000, "Luci", "6669", 100);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.deposit(10000);
        myChecking.deposit(2000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.withdraw(1500);
        myChecking.withdraw(200);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.withdraw(10000000);
        myChecking.withdraw(100);

        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());


    }
}
