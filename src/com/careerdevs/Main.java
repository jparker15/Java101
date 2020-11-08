package com.careerdevs;

import Account.BankAccount;
import Account.CDInvestment;
import Account.CheckingAccount;
import Account.InvestmentAccount;

public class Main {

    public static void main(String[] args) {

//        BankAccount myAcct = new BankAccount(100000, "Jar", "123", "CryptoWallet");
//        CheckingAccount myChecking = new CheckingAccount(100000, "Luci", "6669", 100);
//        System.out.println(myAcct.toString());
//        System.out.println(myChecking.toString());
//        myAcct.deposit(10000);
//        myChecking.deposit(2000);
//        System.out.println(myAcct.toString());
//        System.out.println(myChecking.toString());
//        myAcct.withdraw(1500);
//        myChecking.withdraw(200);
//        System.out.println(myAcct.toString());
//        System.out.println(myChecking.toString());
//        myAcct.withdraw(10000000);
//        myChecking.withdraw(100);
//
//        System.out.println(myAcct.toString());
//        System.out.println(myChecking.toString());

        InvestmentAccount myInvest = new InvestmentAccount(1000000,"Jar","1445",5);
        CDInvestment myCD = new CDInvestment(300000,"Me","1358",20);
        System.out.println(myInvest);
        myInvest.applyInvestment();
        System.out.println(myInvest);


    }
}
