package banking;

/**
 *
 * @author Nick
 */
public class Bank implements IBank {

    public String bankNumber;
    public String address;

    public void addClient(Client newClient) {
    }

    public void displayClientAccounts(int clientId) {
    }

    public void displayClientList() {
    }

    public Client getClient(int id) {
        return null;
    }

    public Account getClientAccount(int clientId, int accountNumber) {
        return null;
    }

    // getters
    public String getbankNumber() {
        return this.bankNumber;
    }

    public String getaddress() {
        return this.address;
    }

    // setters
    public void setbankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void setaddress(String address) {
        this.address = address;
    }

}
