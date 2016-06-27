package Strategy;
//
//  MakeWithdraw_ATM1.java
//
//
//  Created by Aditya on 04/24/16.
//
//
import DataStore.*;

public class MakeWithdraw_ATM1 extends MakeWithdraw
{
	public void MakeWithdraw(DataStore dataStore)
	{
		((DataStore1)dataStore).setWithdraw();
		((DataStore1)dataStore).computeBalanceWithdraw();
		System.out.println("ATM Machine 1:: After Withdrawal, Balance is " + ((DataStore1)dataStore).getBalance() );
	}
}