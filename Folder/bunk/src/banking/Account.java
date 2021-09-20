
package banking;

/**
 *
 * @author Nick
 */
public class Account{

    protected int accountNumber;
    protected double balance;
    protected doubleString owner;
    protected static int counter;


    public Account(){
        counter++;
}
    public double deposit(double d){
        return 0.0;
    }

    public void displayAllTransactions(){
    }


    // getters
    public String getTransactions(){
        return null;
    }
    
    public int getaccountNumber() {
        return this.accountNumber;
    }

    public double getbalance() {
        return this.balance;
    }

    public String getowner() {
        return this.owner;
    }

    public static int getcounter() {
        return counter;
    }


    // setters
    public void setaccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public void setowner(String owner) {
        this.owner = owner;
    }

}
