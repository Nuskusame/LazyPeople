package banking;

/**
 *
 * @author Nick
 */
public class Bank {
    
    private String bankNumber;
    private String address;
   
    public void addClient(Client newClient){}

    public void displayClientAccounts(int clientId){}

    public void displayClientList(){}


    //getters 
   public String getbankNumber(){
       return this.bankNumber;
   }
   
   public String getaddress(){
       return this.address;
   }   

   public Client getClient(){
       return null;
   }

   public Account getClientAccount(int clientId, String bankNumber){
       return null;
   }
       
   //setters
   public void setbankNumber(String bankNumber){
       this.bankNumber = bankNumber;
   }
   
   public void setaddress(String address){
       this.address = address;
   }

}

