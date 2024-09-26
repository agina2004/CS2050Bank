public class Checking extends ACCOUNTADT {
    public double overdraft;

    public Checking(int ACCOUNTbalance, double interestRate,double overdraft) {
        super(ACCOUNTbalance, interestRate, "Checking");
        this.getOverdraft();
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraft = overdraft;


    }

    @Override
    public String toString() {
        return "Checking {" +
                ", accountType='" + getACCOUNtype() +
                ", accountBalance=" + getACCOUNTbalance() +
                ", interestRate=" + getInterestRate() +
                ", overdraft=" + overdraft +
                "}";
    }
}




