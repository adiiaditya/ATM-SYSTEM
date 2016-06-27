package MDA_EFSM;
//
//  LockedState.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class LockedState implements State
{
    MDAEFSM mdaefsm =null;
    
    public LockedState(MDAEFSM mdaefsm)
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
        mdaefsm.setState(mdaefsm.getS1State());
    }
    
    public void IncorrectUnlock()
    {
        mdaefsm.output.IncorrectUnlockMsg();
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
