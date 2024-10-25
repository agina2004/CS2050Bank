import java.io.Serializable;

public class ACCOUNT implements Serializable {

    public String ACCOUNtype;
    public int ACCOUNTbalance;
    public double interestRate;
    public long  ACCOUNTnumber;


    public ACCOUNT(long  ACCOUNTnumber ,int ACCOUNTbalance, double interestRate, String ACCOUNtype) {

        this.ACCOUNtype = ACCOUNtype;
        this.ACCOUNTbalance = ACCOUNTbalance;
        this.interestRate = interestRate;
        this.ACCOUNTnumber = ACCOUNTnumber;
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

    public void setACCOUNTnumber(long ACCOUNTnumber) {this.ACCOUNTnumber = ACCOUNTnumber;}


    public String getACCOUNtype() {
        return ACCOUNtype;
    }

    public int getACCOUNTbalance() {
        return ACCOUNTbalance;
    }


    public double getInterestRate() {
        return interestRate;
    }

    public long getACCOUNTnumber() {return ACCOUNTnumber;}


    @Override
    public String toString() {
        return "ACCOUNT {" +
                ", ACCOUNT number=" + getACCOUNTnumber() +
                ", account Type='" + getACCOUNtype() +
                ", account Balance=" + getACCOUNTbalance() +
                ", interest Rate=" + getInterestRate() +

                '}';
    }

}



