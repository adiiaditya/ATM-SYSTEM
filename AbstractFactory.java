package AbstractFactory;
//
//  AbstractFactory.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import DataStore.*;
import Strategy.*;

/*
 * INTERFACE:: Abstract Factory PATTERN starts here
 */

public interface AbstractFactory 
{
	public DataStore CreateDataStore();
    public DisplayBalance CreateDisplayBalance();
    public DisplayMenu CreateDisplayMenu();
    public IncorrectIdMsg CreateIncorrectIdMsg();
    public IncorrectLockMsg CreateIncorrectLockMsg();
	public IncorrectPinMsg CreateIncorrectPinMsg();
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg();
    public MakeDeposit CreateMakeDeposit();
    public MakeWithdraw CreateMakeWithdraw();
    public NoFundsMsg CreateNoFundsMsg();
    public Penalty CreatePenalty();
    public PromptForPin CreatePromptForPin();
    public StoreData CreateStoreData();
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg();
}
