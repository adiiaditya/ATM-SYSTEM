package Strategy;
//
//  Penalty_ATM1.java
//
//
//  Created by Aditya on 04/24/16.
//
//
import DataStore.*;

public class Penalty_ATM1 extends Penalty
{
	public void Penalty(DataStore dataStore)
	{
		((DataStore1)dataStore).setPenalty();
		System.out.println("ATM Machine 1:: Minimum required balance is $500. So Penalty is applied.");
		System.out.println("ATM Machine 1:: After a Penalty of 20$, Balance is " + ((DataStore1)dataStore).balance );
	}
}