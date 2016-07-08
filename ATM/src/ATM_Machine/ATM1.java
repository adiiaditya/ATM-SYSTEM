package ATM_Machine;
//
//  ATM1.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import MDA_EFSM.MDAEFSM;
import DataStore.DataStore;
import DataStore.DataStore1;

/*
 * CLASS : ATM1 Machine Implementation for collecting parameters
 * from the UI through Driver.java and invoking right event in MDA-EFSM
 */

public class ATM1 
{
	/* Pointer to MDA-EFSM */
	MDAEFSM mdaefsm = null;
	/* Pointer to DataStore */
	DataStore dataStore = null;	
	
	public ATM1(MDAEFSM mdaefsm,DataStore dataStore) 
	{
        this.mdaefsm = mdaefsm;
        this.dataStore = dataStore;
    }

	public void open(String p, String y, float a)
	{
		if(a > 0)
		{
	        ((DataStore1)dataStore).tempPin = p;
	        ((DataStore1)dataStore).tempBalance = a;
	        ((DataStore1)dataStore).tempID = y;
	        mdaefsm.Open();			
		}
		else
		{
			System.out.println("Amount can't be in negative");
		}
    }
    
    public void pin(String x)
    {
    	if(x.equals(((DataStore1)dataStore).tempPin))
    	{
    		if(((DataStore1)dataStore).tempBalance > 500.00)
    			mdaefsm.CorrectPinAboveMin();
    		else
                mdaefsm.CorrectPinBelowMin();
    	}
    	else
    	{
    		mdaefsm.IncorrectPin(3);
    	}
    }
    
    public void deposit(float d)
    {
    	if(d > 0)
    	{
    		((DataStore1)dataStore).tempDeposit = d;
        	mdaefsm.Deposit();
        	
        	if(((DataStore1)dataStore).tempBalance > 500.00)
        	{
        		mdaefsm.AboveMinBalance();
        	}
        	else
        	{
        		mdaefsm.BelowMinBalance();
        	}
    	}
    	
    	else
    	{
    		System.out.println("Amount can't be in negative");
    	}
    }
    
    public void withdraw(float w)
    {
    	if(w>0)
    	{
    		((DataStore1)dataStore).tempWithdraw = w;
        	mdaefsm.Withdraw();
        	
        	if(((DataStore1)dataStore).tempBalance > 500.00)
        	{
        		mdaefsm.AboveMinBalance();
        	}
        	else
        	{
        		mdaefsm.WithdrawBelowMinBalance();
        	}
    	}
    	
    	else
    	{
    		System.out.println("Amount can't be in negative");
    	}
    	
    	
    	
    }
    
    public void balance()
    {
    	mdaefsm.Balance();
    }
    
    public void login(String y){
        if(y.equals(((DataStore1)dataStore).tempID))
            mdaefsm.Login();
        else
            mdaefsm.IncorrectLogin();
    }
    
    public void logout()
    {
        mdaefsm.Logout();
    }
    
    public void lock(String x)
    {
    	if(x.equals(((DataStore1)dataStore).tempPin))
            mdaefsm.Lock();
    	else
            mdaefsm.IncorrectLock();
    }
    
    public void unlock(String x)
    {
    	if(x.equals(((DataStore1)dataStore).tempPin))
    	{
    		mdaefsm.Unlock();
    	
    		if(((DataStore1)dataStore).balance > 500.00)
    		{
    			mdaefsm.AboveMinBalance();
    		}
    		else
    		{
    			mdaefsm.BelowMinBalance();
    		}
    	}
    	else
    		mdaefsm.IncorrectUnlock();

    }
}
