public class ACCOUNTADT {

    public String ACCOUNtype;
    public int ACCOUNTbalance;
    public double interestRate;


    public ACCOUNTADT(int ACCOUNTbalance, double interestRate, String ACCOUNtype) {

        this.ACCOUNtype = ACCOUNtype;
        this.ACCOUNTbalance = ACCOUNTbalance;
        this.interestRate = interestRate;

    }


    public void setACCOUNtype(String ACCOUNtype) {
        this.ACCOUNtype = ACCOUNtype;
    }

    public void setACCOUNTbalance(int ACCOUNTbalance) {
        this.ACCOUNTbalance = ACCOUNTbalance;
    }


    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public String getACCOUNtype() {
        return ACCOUNtype;
    }

    public int getACCOUNTbalance() {
        return ACCOUNTbalance;
    }


    public double getInterestRate() {
        return interestRate;
    }


    @Override
    public String toString() {
        return "ACCOUNT {" +
                ", accountType='" + getACCOUNtype() +
                ", accountBalance=" + getACCOUNTbalance() +
                ", interestRate=" + getInterestRate() +
                '}';
    }

}
