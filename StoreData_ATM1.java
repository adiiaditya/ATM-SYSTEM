package Strategy;
//
//  StoreData_ATM1.java
//
//
//  Created by Aditya on 04/24/16.
//
//
import DataStore.*;

public class StoreData_ATM1 extends StoreData
{
	public void StoreData(DataStore dataStore)
	{
		((DataStore1)dataStore).setID();
		((DataStore1)dataStore).setPin();
        ((DataStore1)dataStore).setBalance();
		System.out.println("ATM Machine 1:: After storing the ID, pin and balance, ID is" + ((DataStore1)dataStore).id + " PIN is " + ((DataStore1)dataStore).pin + " and Balance is " + ((DataStore1)dataStore).balance);
	}
}