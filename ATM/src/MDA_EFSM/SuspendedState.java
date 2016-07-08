package MDA_EFSM;
//
// SuspendedState.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class SuspendedState implements State
{
    MDAEFSM mdaefsm =null;
    
    public SuspendedState(MDAEFSM mdaefsm)
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
        
    }
    
    public void CorrectPinBelowMin()
    {
        
    }
    
    public void CorrectPinAboveMin()
    {
        
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
       
    }
    
    public void Balance()
    {
        mdaefsm.output.DisplayBalance();
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
        mdaefsm.setState(mdaefsm.getReadyState());
    }
    
    public void Close()
    {
    	mdaefsm.setState(mdaefsm.getStartState());
    }
}
