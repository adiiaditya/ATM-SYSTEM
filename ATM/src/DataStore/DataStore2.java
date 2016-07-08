package DataStore;
//
//  DataStore2.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class DataStore2 extends DataStore
{
    
    /* Temporary Storage Variables */
    public int tempBalance;
    public int tempPin;
    public int tempID;
    public int tempDeposit;
    public int tempWithdraw;
    
    
    /* Permanent Storage Variables */
    public int balance;
    public int pin;
    public int id;
    public int deposit;
    public int withdraw;
    
    public int getBalance()
    {
        return this.balance;
    }
    
    public int getPin()
    {
        return this.pin;
    }
    
    public int getID()
    {
        return this.id;
    }
    
    public int setBalance()
    {
        return this.balance = this.tempBalance;
    }
    
    public int setPin()
    {
        return this.pin = this.tempPin;
    }
    
    public int setID()
    {
        return this.id = this.tempID;
    }
    
    public int setPenalty()
    {
        this.balance = this.balance - 0;
        this.tempBalance = balance;
        return this.balance;
    }
    
    public void computeBalanceDeposit()
    {
        this.balance = this.balance + this.deposit;
        this.tempBalance = this.balance;
    }
    public void computeBalanceWithdraw()
    {
        this.balance = this.balance - this.withdraw;
        this.tempBalance = this.balance;
    }
    
    public void setDeposit()
    {
        this.deposit = this.tempDeposit;
    }
    public void setWithdraw()
    {
        this.withdraw = this.tempWithdraw;
    }
    public int getDeposit()
    {
        return this.deposit;
    }
    public int getWithdraw()
    {
        return this.withdraw;
    }
}