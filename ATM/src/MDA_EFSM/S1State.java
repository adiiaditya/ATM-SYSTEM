package MDA_EFSM;
//
//  S1State.java
//
//
//  Created by Aditya on 04/24/16.
//
//

public class S1State implements State
{
    MDAEFSM mdaefsm =null;
    
    public S1State(MDAEFSM mdaefsm)
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
        mdaefsm.setState(mdaefsm.getOverdrawnState());
    }
    
    public void AboveMinBalance()
    {
        mdaefsm.setState(mdaefsm.getReadyState());
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
        mdaefsm.output.Penalty();
        mdaefsm.setState(mdaefsm.getOverdrawnState());
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
