package Strategy;
//
//  MakeDeposit_ATM1.java
//
//
//  Created by Aditya on 04/24/16.
//
//
import DataStore.*;

public class MakeDeposit_ATM1 extends MakeDeposit
{
	public void MakeDeposit(DataStore dataStore)
	{
		((DataStore1)dataStore).setDeposit();
		((DataStore1)dataStore).computeBalanceDeposit();
		System.out.println("ATM Machine 1:: After Deposit, Balance is " + ((DataStore1)dataStore).getBalance() );
	}
}