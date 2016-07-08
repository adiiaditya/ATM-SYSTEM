package AbstractFactory;
//
//  ConcreteFactory2.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import DataStore.DataStore;
import DataStore.DataStore1;
import DataStore.DataStore2;
import Strategy.*;

public class ConcreteFactory2 implements AbstractFactory
{
    DataStore ds = new DataStore2();
    DisplayBalance displayBalance = new DisplayBalance_ATM2();
    DisplayMenu displayMenu = new DisplayMenu_ATM2();
    IncorrectIdMsg incorrectIdMsg = new IncorrectIdMsg_ATM2();
    IncorrectLockMsg incorrectLockMsg = new IncorrectLockMsg_ATM2();
    IncorrectPinMsg incorrectPinMsg = new IncorrectPinMsg_ATM2();
    IncorrectUnlockMsg incorrectUnlockMsg = new IncorrectUnlockMsg_ATM2();
    MakeDeposit makeDeposit = new MakeDeposit_ATM2();
    MakeWithdraw makeWithdraw = new MakeWithdraw_ATM2();
    NoFundsMsg noFundsMsg = new NoFundsMsg_ATM2();
    Penalty penalty = new Penalty_ATM2();
    PromptForPin promptForPin = new PromptForPin_ATM2();
    StoreData storeData = new StoreData_ATM2();
    TooManyAttemptsMsg tooManyAttemptsMsg = new TooManyAttemptsMsg_ATM2();
    
    
    
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
