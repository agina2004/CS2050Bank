import java.io.Serializable;

public class Checking extends ACCOUNT  implements Serializable {
    public double overdraft;

    public Checking(long  ACCOUNTnumber,int ACCOUNTbalance, double interestRate,double overdraft) {
        super(ACCOUNTnumber,ACCOUNTbalance, interestRate, "Checking");
        this.overdraft =overdraft;

    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraftLimit(double overdraft) {
        this.overdraft = overdraft;


    }

    @Override
    public String toString() {
        return "Checking {" +
                " ACCOUNT number="+getACCOUNTnumber()+
                " accountType='" + getACCOUNtype() +
                ", accountBalance=" + getACCOUNTbalance() +
                ", interestRate=" + getInterestRate() +
                ", overdraft=" + overdraft +
                "}";
    }
}




