package MDA_EFSM;
//
//  IdleState.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class IdleState implements State
{
    MDAEFSM mdaefsm =null;
    
    public IdleState(MDAEFSM mdaefsm)
    {
        this.mdaefsm =  mdaefsm;
    }  
    
    public void Open()
    {
        
    }
    
    public void Login()
    {
        mdaefsm.attempts = 0;
        mdaefsm.output.PromptForPin();
        mdaefsm.setState(mdaefsm.getCheckPinState());
        
    }
    
    public void IncorrectLogin()
    {
        mdaefsm.output.IncorrectIdMsg();
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
