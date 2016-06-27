package MDA_EFSM;
//
//  CheckPinState.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class CheckPinState implements State
{
    MDAEFSM mdaefsm =null;
    
    public CheckPinState(MDAEFSM mdaefsm) 
    {
        this.mdaefsm =  mdaefsm;
    }  
    
    public void Open()
    {
    	
    }
    
    public void Login()
    {
    	
    }
    
    public void IncorrectLogin()
    {
        
    }
    
    public void IncorrectPin(int max)
    {
    	if( mdaefsm.attempts < max )
    	{
    		mdaefsm.attempts++;
    		mdaefsm.output.IncorrectPinMsg();
    	}
    	else if( mdaefsm.attempts == max )
    	{
    		mdaefsm.output.IncorrectPinMsg();
    		mdaefsm.output.TooManyAttemptsMsg();
    		mdaefsm.setState(mdaefsm.getIdleState());
    	}
    		
    }
    
    public void CorrectPinBelowMin()
    {
    	mdaefsm.output.DisplayMenu();
    	mdaefsm.setState(mdaefsm.getOverdrawnState());
    }
    
    public void CorrectPinAboveMin()
    {
    	mdaefsm.output.DisplayMenu();
    	mdaefsm.setState(mdaefsm.getReadyState());
    }
    
    public void Deposit()
    {
    	
    }
    
    public void BelowMinBalance()
    {
    	
    }
    
    public void AboveMinBalance()
    {
    	
    }
    
    public void Logout()
    {
    	mdaefsm.setState(mdaefsm.getIdleState());
    }
    
    public void Balance()
    {
    	
    }
    
    public void Withdraw()
    {
    	
    }
    
    public void WithdrawBelowMinBalance()
    {
        
    }
    
    public void NoFunds()
    {
        
    }
    
    public void Lock()
    {
    	
    }
    
    public void IncorrectLock()
    {
        
    }
    
    public void Unlock()
    {
    	
    }
    
    public void IncorrectUnlock()
    {
        
    }
    
    public void Suspend()
    {
        
    }
    
    public void Activate()
    {
        
    }
    
    public void Close()
    {
        
    }
}
