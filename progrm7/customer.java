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

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public ACCOUNT getAccount() {
        return account;
    }

    public void setAccount(ACCOUNT account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Customer [Name: " + name + ", ID: " + customerID + ", Account: " + account + "]";
    }








}