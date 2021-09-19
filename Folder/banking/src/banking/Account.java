/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author Nick
 */
public class Account {
    private int accountNumber;
    private double balance;
    private String owner;
    public static int counter;
    
    //getters
    public static int getaccountNumber(){
        return this.accountNumber;
    }
    
    public double getbalance(){
        return this.balance;
    }
    
    public String getowner(){
        return this.owner;
    }
    
    public static int getcounter(){
        return this.counter;
    }
    
    //setters
    public void setaccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
        
    }
    
    public void setbalance(double balance){
        this.balance = balance;
    }
    
    public void setowner(String owner){
        this.owner = owner;
    }
 
    public Account(){
        
    }    


}

