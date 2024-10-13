import java.io.Serializable;

public class customer implements Serializable  {
    private String name;
    private int customerID;
    private ACCOUNT account;


    public customer(String name, int customerID, ACCOUNT account) {
        this.name = name;
        this.customerID = customerID;
        this.account = account;
    }

    public ACCOUNT getAccount() {
        return account;
    }

    public int customerID() {
        return customerID;
    }

    public String name() {
        return name;
    }
    

    public String toString() {
        return "Customer [Name: " + name + ", ID: " + customerID + ", Account: " + account + "]";
    }








}