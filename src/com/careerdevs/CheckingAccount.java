package com.careerdevs;

public class CheckingAccount extends BankAccount {

    private int dailyLimit;
    private int dailyWithdrawn = 0;

    public CheckingAccount(int balance, String owner, String accountNum, int dailyLimit){
        super (balance, owner, accountNum, "checking");
        this.dailyLimit = dailyLimit;
    }

    public void resetDailyWithDrawn(){
        dailyWithdrawn = 0;
    }

     @Override
    public void withdraw(int amt){
        if (dailyWithdrawn + amt > dailyLimit){
            System.out.println("Error over limit");
            return;
        }
        //reuse of parent withdraw method
        super.withdraw(amt);
        dailyWithdrawn += amt;
     }

}
