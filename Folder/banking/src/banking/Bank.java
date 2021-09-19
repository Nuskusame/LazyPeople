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
public class Bank {
    
    private String bankNumber;
    private String address;
   

   //getters 
   public String getbankNumber(){
       return this.bankNumber;
   }
   
   public String getaddress(){
       return this.address;
   }   
       
   //setters
   public void setbankNumber(String bankNumber){
       this.bankNumber = bankNumber;
   }
   
   public void setaddress(String address){
       this.address = address;
   }

}

