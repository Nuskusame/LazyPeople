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
public class Client {
    
    private int id;
    private String firstName;
    private String lastName;
    public static int counter;
    
   
    //getters
    public static int getid(){
        return this.id;
    }
    
    public static String getlastName(){
        return this.lastName;
    }   
    
    public static String getfirstName(){
        return this.firstName;
    }
    

    //setters
    public void setid(int id){
        this.id = id;
     }
    
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    

}