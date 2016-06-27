package MDA_EFSM;
//
//  OverdrawnState.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class OverdrawnState implements State
{
    MDAEFSM mdaefsm =null;
    
    public OverdrawnState(MDAEFSM mdaefsm)
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
        mdaefsm.output.MakeDeposit();
        mdaefsm.setState(mdaefsm.getS1State());
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
        mdaefsm.output.DisplayBalance();
    }
    
    public void Withdraw()
    {
        mdaefsm.output.NoFundsMsg();
    }
    
    public void WithdrawBelowMinBalance()
    {
        
    }
    
    public void NoFunds()
    {
        
    }
    
    public void Lock()
    {
        mdaefsm.setState(mdaefsm.getLockedState());
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
