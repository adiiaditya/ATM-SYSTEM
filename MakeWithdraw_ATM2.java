package Strategy;
//
//  MakeWithdraw_ATM2.java
//
//
//  Created by Aditya on 04/24/16.
//
//
import DataStore.*;

public class MakeWithdraw_ATM2 extends MakeWithdraw
{
	public void MakeWithdraw(DataStore dataStore)
	{
		((DataStore2)dataStore).setWithdraw();
		((DataStore2)dataStore).computeBalanceWithdraw();
		System.out.println("ATM Machine 2:: After Withdraw, Balance is " + ((DataStore2)dataStore).getBalance() );
	}
}