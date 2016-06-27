package ATM_Machine;
//
//  ATM2.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import MDA_EFSM.MDAEFSM;
import DataStore.DataStore;
import DataStore.DataStore1;
import DataStore.DataStore2;

/*
 * CLASS : ATM2 Machine Implementation for collecting parameters
 * from the UI through Driver.java and invoking right event in MDA-EFSm
 */

public class ATM2 
{
	
	/* Pointer to MDA-EFSM */
	MDAEFSM mdaefsm = null;
	/* Pointer to DataStore */
	DataStore dataStore = null;	
	
	public ATM2(MDAEFSM mdaefsm,DataStore dataStore) 
	{
        this.mdaefsm = mdaefsm;
        this.dataStore = dataStore;
    }

    public void OPEN(int p, int y, int a)
    {
    	if(a > 0)
		{
	        ((DataStore2)dataStore).tempPin = p;
	        ((DataStore2)dataStore).tempBalance = a;
	        ((DataStore2)dataStore).tempID = y;
	        mdaefsm.Open();			
		}
		else
		{
			System.out.println("Amount can't be in negative");
		}
    }
    
    public void PIN(int x)
    {
    	if(x == ((DataStore2)dataStore).tempPin)
    	{
            mdaefsm.CorrectPinAboveMin();
    	}
    	else
    	{
    		mdaefsm.IncorrectPin(2);
    	}
    }
    
    public void DEPOSIT(int d)
    {
    	if(d > 0)
    	{
        	((DataStore2)dataStore).tempDeposit = d;
        	mdaefsm.Deposit();
    	}
    	else
		{
			System.out.println("Wrong Input");
		}
    }
    
    public void WITHDRAW(int w)
    {
    	if(w > 0)
    	{
    		((DataStore2)dataStore).tempWithdraw = w;
        	if( ((DataStore2)dataStore).tempBalance > 0)
        	{
                mdaefsm.Withdraw();
        	}
        	else
        	{
        		mdaefsm.NoFunds();
        	}
    	}
    	else
		{
			System.out.println("Amount can't be in negative");
		}
    	
    }
    
    public void BALANCE()
    {
    	mdaefsm.Balance();
    }
    
    public void LOGIN(int y){
        if(y == (((DataStore2)dataStore).tempID))
            mdaefsm.Login();
        else
            mdaefsm.IncorrectLogin();
    }
    
    public void LOGOUT()
    {
        mdaefsm.Logout();
    }
    
    public void suspend()
    {
        mdaefsm.Suspend();
    }
    
    public void activate()
    {
        mdaefsm.Activate();
    }
    
    public void close()
    {
        mdaefsm.Close();
    }
}