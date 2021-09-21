
package banking;

import java.util.ArrayList;

/**
 *
 * @author Nick
 */
public class Account implements IAccount {

    protected int accountNumber;
    protected double balance;
    protected String owner;
    protected static int counter;

    public Account() {
        counter++;
    }

    public double deposit(double d) {
        return 0.0;
    }

    public void displayAllTransactions() {

    }

    public ArrayList<Transaction> getTransactions() {
        return null;
    }

    // getters

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
        return Account.counter;
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

    public double withdrawal(double w) {
        return 0.0;
    }

}
