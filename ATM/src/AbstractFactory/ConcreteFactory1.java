package AbstractFactory;
//
//  ConcreteFactory1.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import DataStore.DataStore;
import DataStore.DataStore1;
import Strategy.*;


public class ConcreteFactory1 implements AbstractFactory 
{
    DataStore ds = new DataStore1();
    DisplayBalance displayBalance = new DisplayBalance_ATM1();
    DisplayMenu displayMenu = new DisplayMenu_ATM1();
    IncorrectIdMsg incorrectIdMsg = new IncorrectIdMsg_ATM1();
    IncorrectLockMsg incorrectLockMsg = new IncorrectLockMsg_ATM1();
    IncorrectPinMsg incorrectPinMsg = new IncorrectPinMsg_ATM1();
    IncorrectUnlockMsg incorrectUnlockMsg = new IncorrectUnlockMsg_ATM1();
    MakeDeposit makeDeposit = new MakeDeposit_ATM1();
    MakeWithdraw makeWithdraw = new MakeWithdraw_ATM1();
    NoFundsMsg noFundsMsg = new NoFundsMsg_ATM1();
    Penalty penalty = new Penalty_ATM1();
    PromptForPin promptForPin = new PromptForPin_ATM1();
    StoreData storeData = new StoreData_ATM1();
    TooManyAttemptsMsg tooManyAttemptsMsg = new TooManyAttemptsMsg_ATM1();
    
	
	
	public void ConcreteFactory()
	{
		
	}
    
    public DataStore CreateDataStore()
    {
        return(this.ds);
    }
    
    public DataStore GetDataStore()
    {
        return this.ds;
    }
    
    public DisplayBalance CreateDisplayBalance()
    {
        return this.displayBalance;
    }
    
    public DisplayMenu CreateDisplayMenu()
    {
        return this.displayMenu;
    }
    
    public IncorrectIdMsg CreateIncorrectIdMsg()
    {
        return this.incorrectIdMsg;
    }
    
    public IncorrectLockMsg CreateIncorrectLockMsg()
    {
        return this.incorrectLockMsg;
    }
    
    public IncorrectPinMsg CreateIncorrectPinMsg()
    {
        return this.incorrectPinMsg;
    }
    
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg()
    {
        return this.incorrectUnlockMsg;
    }
    
    public MakeDeposit CreateMakeDeposit()
    {
        return this.makeDeposit;
    }
    
    public MakeWithdraw CreateMakeWithdraw()
    {
        return this.makeWithdraw;
    }
    
    public NoFundsMsg CreateNoFundsMsg()
    {
        return this.noFundsMsg;
    }
    
    public Penalty CreatePenalty()
    {
        return this.penalty;
    }
    
    public PromptForPin CreatePromptForPin()
    {
        return this.promptForPin;
    }
    
    public StoreData CreateStoreData()
    {
        return this.storeData;
    }
    
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg()
    {
        return this.tooManyAttemptsMsg;
    }
}
