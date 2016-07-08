package Strategy;
//
//  DisplayBalance_ATM1.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import DataStore.*;

public class DisplayBalance_ATM1 extends DisplayBalance
{
	public void DisplayBalance(DataStore dataStore)
	{
		System.out.println("ATM Machine 1:: Account Balance is: " + ((DataStore1)dataStore).getBalance() );
	}
}
