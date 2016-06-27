package Strategy;
//
//  MakeDeposit_ATM2.java
//
//
//  Created by Aditya on 04/24/16.
//
//
import DataStore.*;

public class MakeDeposit_ATM2 extends MakeDeposit
{
	public void MakeDeposit(DataStore dataStore)
	{
		((DataStore2)dataStore).setDeposit();
		((DataStore2)dataStore).computeBalanceDeposit();
		System.out.println("ATM Machine 2:: After Deposit, Balance is " + ((DataStore2)dataStore).getBalance() );
	}
}