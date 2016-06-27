package MDA_EFSM;
//
//  MDAEFSM.java
//
//
//  Created by Aditya on 04/24/16.
//
//

import AbstractFactory.AbstractFactory;
import Output.Output;

/* 
 *  CLASS : MDAEFSM ( STATE PATTERN )
 */

public class MDAEFSM {

    State checkpinState = new CheckPinState(this);
    State idleState = new IdleState(this);
    State lockedState = new LockedState(this);
    State overdrawnState = new OverdrawnState(this);
    State readyState = new ReadyState(this);
    State s1State = new S1State(this);
    State startState = new StartState(this);
    State suspendedState = new SuspendedState(this);
    
    State efsmState = null;

    //State List[8] ;
	public int attempts;
	
	AbstractFactory factory =null;
	Output output = null;
    
    public MDAEFSM(AbstractFactory factory,Output output) {
        efsmState = startState;
        attempts = 0;
        this.factory = factory;
        this.output = output;
    }
    
    public void Open()
    {
        efsmState.Open();
        printCurrentState();
    }
    
    public void Login()
    {
        efsmState.Login();
        attempts = 0;
        printCurrentState();
    }
    
    public void IncorrectLogin()
    {
        efsmState.IncorrectLogin();
        printCurrentState();
    }
    
    public void IncorrectPin(int max)
    {
        efsmState.IncorrectPin(max);
        printCurrentState();
    }
    
    public void CorrectPinBelowMin()
    {
        efsmState.CorrectPinBelowMin();
        printCurrentState();
    }
    
    public void CorrectPinAboveMin()
    {
        efsmState.CorrectPinAboveMin();
        printCurrentState();
    }
    
    public void Deposit()
    {
        efsmState.Deposit();
        printCurrentState();
    }
    
    public void BelowMinBalance()
    {
        efsmState.BelowMinBalance();
        printCurrentState();
    }
    
    public void AboveMinBalance()
    {
        efsmState.AboveMinBalance();
        printCurrentState();
    }
    
    public void Logout()
    {
        efsmState.Logout();
        printCurrentState();
    }
    
    public void Balance()
    {
        efsmState.Balance();
        printCurrentState();
    }
    
    public void Withdraw()
    {
        efsmState.Withdraw();
        printCurrentState();
    }
    
    public void WithdrawBelowMinBalance()
    {
        efsmState.WithdrawBelowMinBalance();
        printCurrentState();
    }
    
    public void NoFunds()
    {
        efsmState.NoFunds();
        printCurrentState();
    }
    
    public void Lock()
    {
        efsmState.Lock();
        printCurrentState();
    }
    
    public void IncorrectLock()
    {
        efsmState.IncorrectLock();
        printCurrentState();
    }
    
    public void Unlock()
    {
        efsmState.Unlock();
        printCurrentState();
    }
    
    public void IncorrectUnlock()
    {
        efsmState.IncorrectUnlock();
        printCurrentState();
    }
    
    public void Suspend()
    {
        efsmState.Suspend();
        printCurrentState();
    }
    
    public void Activate()
    {
        efsmState.Activate();
        printCurrentState();
    }
    
    public void Close()
    {
        efsmState.Close();
        printCurrentState();
    }
    
    public void setState(State efsmState) 
    {
        this.efsmState = efsmState;
    }
    public State getMachineState() {
        return efsmState;
    }
    
    public State getCheckPinState() {
        return checkpinState;
    }
    
    public State getSuspendedState() {
        return suspendedState;
    }
    
    public State getIdleState() {
        return idleState;
    }
    
    public State getStartState() {
        return startState;
    }
    
    public State getLockedState() {
        return lockedState;
    }
    
    public State getOverdrawnState() {
        return overdrawnState;
    }
    
    public State getReadyState() {
        return readyState;
    }
    
    public State getS1State() {
        return s1State;
    }
    
    public void printCurrentState(){
    	System.out.println("*** Current State : "+ efsmState.getClass().getName()+"***");
    }
  
}
