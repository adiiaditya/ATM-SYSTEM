package Output;
//
//  Output.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import DataStore.DataStore;
import AbstractFactory.*;
import Strategy.DisplayBalance;
import Strategy.DisplayMenu;
import Strategy.IncorrectIdMsg;
import Strategy.IncorrectLockMsg;
import Strategy.IncorrectPinMsg;
import Strategy.IncorrectUnlockMsg;
import Strategy.MakeDeposit;
import Strategy.MakeWithdraw;
import Strategy.NoFundsMsg;
import Strategy.Penalty;
import Strategy.PromptForPin;
import Strategy.StoreData;
import Strategy.TooManyAttemptsMsg;

/* 
 *  CLASS : Output
 */
public class Output 
{
	AbstractFactory factory =null;
	DataStore dataStore = null;
	
	public Output(AbstractFactory factory,DataStore dataStore) 
	{
        this.factory = factory;
        this.dataStore = dataStore;
    }
	
    public void IncorrectIdMsg()
    {
        System.out.println("\n OUTPUT:: Action IncorrectIdMsg");
        IncorrectIdMsg incorrectID = factory.CreateIncorrectIdMsg();
        incorrectID.IncorrectIdMsg();
    }

	
    public void IncorrectPinMsg()
	{
		System.out.println("\n OUTPUT:: Action IncorrectPinMsg");
		IncorrectPinMsg incorrectPin = factory.CreateIncorrectPinMsg();
		incorrectPin.IncorrectPinMsg();
	}
    
    public void IncorrectLockMsg()
    {
        System.out.println("\n OUTPUT:: Action IncorrectLockMsg");
        IncorrectLockMsg incorrectLock = factory.CreateIncorrectLockMsg();
        incorrectLock.IncorrectLockMsg();
    }
    
    public void IncorrectUnlockMsg()
    {
        System.out.println("\n OUTPUT:: Action IncorrectUnlockMsg");
        IncorrectUnlockMsg incorrectUnlock = factory.CreateIncorrectUnlockMsg();
        incorrectUnlock.IncorrectUnlockMsg();
    }
	
	public void TooManyAttemptsMsg()
	{
		System.out.println("\n OUTPUT:: Action TooManyAttemptsMsg");
		TooManyAttemptsMsg tooManyAttempts = factory.CreateTooManyAttemptsMsg();
		tooManyAttempts.TooManyAttemptsMsg();
	}
	
	public void DisplayMenu()
	{
		System.out.println("\n OUTPUT:: Action DisplayMenu");
		DisplayMenu displayMenu = factory.CreateDisplayMenu();
		displayMenu.DisplayMenu();
	}
		
	public void StoreData()
	{
		System.out.println("\n OUTPUT:: Action StoreData");
		StoreData storeData = factory.CreateStoreData();
		storeData.StoreData(dataStore);
	}
	
	public void NoFundsMsg()
	{
		System.out.println("\n OUTPUT:: Action NoFundsMsg");
		NoFundsMsg noFunds = factory.CreateNoFundsMsg();
		noFunds.NoFundsMsg();
	}
	
	public void PromptForPin()
	{
		System.out.println("\n OUTPUT:: Action PromptForPin ");
		PromptForPin promptForPin = factory.CreatePromptForPin();
		promptForPin.PromptForPin();
	}
	
	public void DisplayBalance()
	{
		System.out.println("\n OUTPUT:: Action DisplayBalance ");
		DisplayBalance displayBalance = factory.CreateDisplayBalance();
		displayBalance.DisplayBalance(dataStore);
	}
	
	public void MakeDeposit()
	{
		System.out.println("\n OUTPUT:: Action MakeDeposit ");
		MakeDeposit makeDeposit = factory.CreateMakeDeposit();
		makeDeposit.MakeDeposit(dataStore);
	}
	
	public void MakeWithdraw()
	{
		System.out.println("\n OUTPUT:: Action MakeWithdraw  ");
		MakeWithdraw makeWithdraw = factory.CreateMakeWithdraw();
		makeWithdraw.MakeWithdraw(dataStore);
	}
	
	public void Penalty()
	{
		System.out.println("\n OUTPUT:: Action Penalty  ");
		Penalty penalty = factory.CreatePenalty();
		penalty.Penalty(dataStore);
	}

}
