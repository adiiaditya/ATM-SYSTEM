//
//  Driver.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import MDA_EFSM.MDAEFSM;
import Output.Output;
import ATM_Machine.ATM1;
import ATM_Machine.ATM2;
import AbstractFactory.ConcreteFactory1;
import AbstractFactory.ConcreteFactory2;


/*
 * CLASS : Driver ( Main function Program)
 */
public class Driver
{
    public static void main( String[] args) throws IOException
    {
    	
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	String input = null;
    	int choice = 1;
    	
		System.out.println(" ******** Select ATM Machine to operate *******" );
		System.out.println("          1. ATM Machine - 1" );
		System.out.println("          2. ATM Machine - 2" );
		 
		input = bufferedReader.readLine();
		if(input.equalsIgnoreCase("1"))
		{
			
	    	ConcreteFactory1 factory = new ConcreteFactory1();
	    	Output output = new Output(factory,factory.GetDataStore());
	    	MDAEFSM mdaefsm = new MDAEFSM(factory,output);
	    	ATM1 atm = new ATM1(mdaefsm,factory.GetDataStore());
	    	
	    	float balance,deposit,withdraw;
	    	String PIN, ID;
    	
	        while (true) 
	        {
	        	
	        	System.out.println("  Enter Operation from the list below: ");
	          
	        	System.out.println("*************************************");
		        System.out.println(" ATM Machine-1 MENU of Operations" );
		        System.out.println("          1. open(String, String, float)" );
		        System.out.println("          2. login(String)" );
		        System.out.println("          3. pin(String)" );
		        System.out.println("          4. deposit(deposit)" );
		        System.out.println("          5. withdraw(withdraw)" );
		        System.out.println("          6. balance(balance)" );
		        System.out.println("          7. lock(PIN)" );
		        System.out.println("          8. unlock(PIN)" );
		        System.out.println("          9. logout()" );
	            System.out.println("*************************************");
	        	
				input = bufferedReader.readLine();
	
	            if(input.isEmpty()) continue;
	            if(input.equalsIgnoreCase("q"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	            
	            switch(choice)
	            {
	      			
		      	    case 1:   //open
		      			System.out.println("\n  Operation:  open(String PIN, String ID, float balance)");
		      			System.out.println("   Enter value of the parameter balance:");
		      			input = bufferedReader.readLine();
		      			balance = Float.parseFloat(input);
		      			
		      			System.out.println("   Enter value of the parameter PIN:");
		      			PIN = bufferedReader.readLine();
                        
                        System.out.println("   Enter value of the parameter ID:");
                        ID = bufferedReader.readLine();

                        
                        atm.open(PIN, ID, balance);
		      			
		      			break;
	
		      	   case 2:  //login
		      			System.out.println("  Operation:  login(String y)");
		      			System.out.println("  Enter value of ID:");
		      			ID = bufferedReader.readLine();
		      			atm.login(ID);
		      			break;
                    
                    case 3:  //pin
                        System.out.println("  Operation:  pin(String x)");
                        System.out.println("  Enter value of PIN:");
                        PIN = bufferedReader.readLine();
                        atm.pin(PIN);
                        break;
	
		      	    case 4:  //deposit
		      			System.out.println("  Operation:  deposit(float d)");
		      			System.out.println("  Enter value of the parameter Deposit:");
		      			input = bufferedReader.readLine();
		      			deposit = Float.parseFloat(input);
		      			atm.deposit(deposit);
		      			break;
		      				
		      	    case 5:  // withdraw
		      			System.out.println("  Operation:  withdraw(float w)");
		      			System.out.println("  Enter value of the parameter Withdraw:");
		      			input = bufferedReader.readLine();
		      			withdraw = Float.parseFloat(input);
		      			atm.withdraw(withdraw);
		      			break;
	
		      	    case 6:  // balance
		      			System.out.println("  Operation:  balance()");
		      			atm.balance();
		      			break;
	
		      	    case 7:  // lock
		      			System.out.println("  Operation:  lock(String PIN)");		
		      			System.out.println("  Enter value of the parameter PIN:");
		      			PIN = bufferedReader.readLine();
		      			atm.lock(PIN);
		      			break;
	
		      	    case 8:  // unlock
		      			System.out.println("  Operation:  unlock(String PIN)");
		      			System.out.println("  Enter value of the parameter PIN:");
		      			PIN = bufferedReader.readLine();
		      			atm.unlock(PIN);
		      			break;
		      			
		      	    case 9:  // logout
		      			System.out.println("  Operation:  logout()");
		      			atm.logout();
		      			break;
		      			
		      		default:
		      			System.out.println("Invalid Choice");
		      			break;
	            }
	        }
	        System.out.println("Thanks for using ATM Machine - 1" );
		}
		
		else if(input.equalsIgnoreCase("2"))
		{
	    	ConcreteFactory2 factory = new ConcreteFactory2();
	    	Output output = new Output(factory,factory.GetDataStore());
	    	MDAEFSM mdaefsm = new MDAEFSM(factory,output);
	    	ATM2 atm = new ATM2(mdaefsm,factory.GetDataStore());
			
			
	        System.out.println("ATM Machine-2" );
	
	        int balance,deposit,withdraw,PIN,ID;
    	
	        while (true) {
	        	
	        	System.out.println("  Enter Operation from the list below: ");
                System.out.println("*************************************");
                System.out.println(" ATM Machine-2 MENU of Operations" );
                System.out.println("          1. OPEN(int, int, int)" );
                System.out.println("          2. LOGIN(int)" );
                System.out.println("          3. PIN(int)" );
                System.out.println("          4. DEPOSIT(deposit)" );
                System.out.println("          5. WITHDRAW(withdraw)" );
                System.out.println("          6. BALANCE()" );
                System.out.println("          7. suspend()" );
                System.out.println("          8. activate()" );
                System.out.println("          9. LOGOUT()" );
                System.out.println("         10. close()" );
                System.out.println("*************************************");
 
				input = bufferedReader.readLine();
	
	            if(input.isEmpty()) continue;
	            if(input.equalsIgnoreCase("q"))
	            	break;
	            
	            choice = Integer.parseInt(input);
	            
	            switch(choice)
	            {
	            	case 1:   //open
	            		System.out.println("\n  Operation:  OPEN(int PIN, int ID, int balance)");
	            		System.out.println("   Enter value of the parameter balance:");
	            		input = bufferedReader.readLine();
	            		balance = Integer.parseInt(input);
	      			
	            		System.out.println("   Enter value of the parameter PIN:");
	            		input = bufferedReader.readLine();
	            		PIN = Integer.parseInt(input);
                    
	            		System.out.println("   Enter value of the parameter ID:");
	            		input = bufferedReader.readLine();
	            		ID = Integer.parseInt(input);

                    
	            		atm.OPEN(PIN, ID, balance);
	      			
	            		break;
	
		      	   case 2:  //login
		      			System.out.println("  Operation:  LOGIN(int x)");
		      			System.out.println("  Enter value of LOGIN:");
		      			input = bufferedReader.readLine();
		      			ID = Integer.parseInt(input);
		      			atm.LOGIN(ID);
		      			break;
		      			
		      	   case 3:  //pin
		      		   System.out.println("  Operation:  PIN(int x)");
		      		   System.out.println("  Enter value of PIN:");
		      		   input = bufferedReader.readLine();
		      		   PIN = Integer.parseInt(input);
		      		   atm.PIN(PIN);
		      		   break;
	
		      	    case 4:  //deposit
		      			System.out.println("  Operation:  DEPOSIT(int d)");
		      			System.out.println("  Enter value of the parameter Deposit:");
		      			input = bufferedReader.readLine();
		      			deposit = Integer.parseInt(input);
		      			atm.DEPOSIT(deposit);
		      			break;
		      				
		      	    case 5:  // withdraw
		      			System.out.println("  Operation:  WITHDRAW(int w)");
		      			System.out.println("  Enter value of the parameter Withdraw:");
		      			input = bufferedReader.readLine();
		      			withdraw = Integer.parseInt(input);
		      			atm.WITHDRAW(withdraw);
		      			break;
	
		      	    case 6:  // balance
		      			System.out.println("  Operation:  BALANCE()");
		      			atm.BALANCE();
		      			break;
		      		
		      	    case 7:  // suspend
		      			System.out.println("  Operation:  suspend()");
		      			atm.suspend();
		      			break;
		      			
		      	    case 8:  // activate
		      			System.out.println("  Operation:  activate()");
		      			atm.activate();
		      			break;
		      			
		      	    case 9:  // logout
		      	    	System.out.println("  Operation:  LOGOUT()");
		      	    	atm.LOGOUT();
		      	    	break;
		      	    	
		      	   case 10:  // close
		      	    	System.out.println("  Operation:  close()");
		      	    	atm.close();
		      	    	break;

		      			
		      	  default:
		      			System.out.println("Invalid Choice");
		      			break;
	            }
	        }
	        System.out.println("Thanks for using ATM Machine - 2" );
		}

    }
}
	       
