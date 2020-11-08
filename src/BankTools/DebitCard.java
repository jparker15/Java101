package BankTools;

import Account.CheckingAccount;

import java.util.ArrayList;
import java.util.List;

public class DebitCard {
    private CheckingAccount primary;
    private String securityCode;
    private String cardNumber;
    private String pin;
    //private Calender expDate;
    private String cardOwner;
    private List<CheckingAccount> atmCheckingAccounts;

    public DebitCard(String cardNumber, String pin, String securityCode, String cardOwner, CheckingAccount primary){
        //array: atmCheckingAccounts[3]
        //array: atmCheckingAccounts.push() <- does not exist
        //list: atmCheckingAccount.get(3);
        //list: atmCheckingAccount.add() == .push()
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.securityCode = securityCode;
        this.cardOwner = cardOwner;
        this.primary = primary;
        this.atmCheckingAccounts = new ArrayList<>();
    }

    public void addCheckingAccount(CheckingAccount account){
        atmCheckingAccounts.add(account);
    }

    public boolean charge (int amt, String pin){
        if(this.pin.equals(pin) && primary.getBalance() >= amt){
            primary.withdraw(amt);
            return true;
        }
        return false;
    }


}
