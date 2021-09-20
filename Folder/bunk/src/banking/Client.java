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
        return counter;
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