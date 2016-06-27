package DataStore;
//
//  DataStore1.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class DataStore1 extends DataStore
{
    
    /* Temporary Storage Variables */
    public float tempBalance;
    public String tempPin;
    public String tempID;
    public float tempDeposit;
    public float tempWithdraw;
    
    
    /* Permanent Storage Variables */
    public float balance;
    public String pin;
    public String id;
    public float deposit;
    public float withdraw;
    
    public float getBalance()
    {
        return this.balance;
    }
    
    public String getPin()
    {
        return this.pin;
    }
    
    public String getID()
    {
        return this.id;
    }
    
    public float setBalance()
    {
        return this.balance = this.tempBalance;
    }
    
    public String setPin()
    {
        return this.pin = this.tempPin;
    }
    
    public String setID()
    {
        return this.id = this.tempID;
    }
    
    public float setPenalty()
    {
        this.balance = this.balance - 20;
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
    public float getDeposit()
    {
        return this.deposit;
    }
    public float getWithdraw()
    {
        return this.withdraw;
    }
}