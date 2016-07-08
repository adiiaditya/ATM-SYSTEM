package MDA_EFSM;
//
//  ReadyState.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class ReadyState implements State
{
    MDAEFSM mdaefsm =null;
    
    public ReadyState(MDAEFSM mdaefsm)
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
        mdaefsm.output.MakeWithdraw();
        mdaefsm.setState(mdaefsm.getS1State());
    }
    
    public void WithdrawBelowMinBalance()
    {
        
    }
    
    public void NoFunds()
    {
        mdaefsm.output.NoFundsMsg();
    }
    
    public void Lock()
    {
        mdaefsm.setState(mdaefsm.getLockedState());
    }
    
    public void IncorrectLock()
    {
        mdaefsm.output.IncorrectLockMsg();
    }
    
    public void Unlock()
    {
        
    }
    
    public void IncorrectUnlock()
    {
        
    }
    
    public void Suspend()
    {
        mdaefsm.setState(mdaefsm.getSuspendedState());
    }
    
    public void Activate()
    {
        
    }
    
    public void Close()
    {
        
    }
}
