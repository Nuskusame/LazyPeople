package banking;

/**
 *
 * @author Nick
 */
public class Client implements IClient {

    private int id;
    private String firstName;
    private String lastName;
    private static int counter;

    public void addAccount(Account newAccount) {

    }

    public void displayAccounts() {

    }

    public Account getAccount(int accountNumber) {
        return null;
    }

    public Client() {
        counter++;
    }

    // getters
    public int getid() {
        return this.id;
    }

    public String getlastName() {
        return this.lastName;
    }

    public String getfirstName() {
        return this.firstName;
    }

    public static int getcounter() {
        return Client.counter;
    }

    // setters
    public void setid(int id) {
        this.id = id;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

}