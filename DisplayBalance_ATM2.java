package Strategy;
//
//  DisplayBalance_ATM2.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import DataStore.*;

public class DisplayBalance_ATM2 extends DisplayBalance
{
	public void DisplayBalance(DataStore dataStore)
	{
		System.out.println("ATM Machine 2:: Balance is: " + ((DataStore2)dataStore).getBalance() );
	}
}