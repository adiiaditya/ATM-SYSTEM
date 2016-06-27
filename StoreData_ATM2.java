package Strategy;
//
//  StoreData_ATM2.java
//
//
//  Created by Aditya on 04/24/16.
//
//
import DataStore.*;

public class StoreData_ATM2 extends StoreData
{
	public void StoreData(DataStore dataStore)
	{
        ((DataStore2)dataStore).setPin();
        ((DataStore2)dataStore).setBalance();
        System.out.println("ATM Machine 2:: After storing the pin and balance, PIN is " + ((DataStore2)dataStore).pin + "and Balance is " + ((DataStore2)dataStore).balance);
	}
}

