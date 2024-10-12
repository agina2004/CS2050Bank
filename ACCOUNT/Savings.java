public  class Savings extends ACCOUNT {
    int initialdeposit;
    int period;
    int additionalcontribution;

    public Savings(long  ACCOUNTnumber ,int ACCOUNTbalance, double interestRate,int initialdeposit,int period, int additionalcontribution ) {

        super(ACCOUNTnumber, ACCOUNTbalance, interestRate, "Savings");

        this.initialdeposit = initialdeposit;
        this.period = period;
        this.additionalcontribution = additionalcontribution;
    }

    public int getInitialdeposit() {
        return initialdeposit;
    }

    public int getAdditionalcontribution() {
        return additionalcontribution;
    }

    public int getPeriod() {
        return period;
    }

    public void setAdditionalcontribution(int additionalcontribution) {
        this.additionalcontribution = additionalcontribution;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    
    public void setInitialdeposit(int initialdeposit) {
        this.initialdeposit = initialdeposit;
    }

    public String toString() {
        return "Savings {" +
                " ACCOUNT number="+getACCOUNTnumber()+
                ", account Type='" + getACCOUNtype() +
                ", account Balance=" + getACCOUNTbalance() +
                ", interest Rate=" + getInterestRate() +
                ", initial deposit=" + initialdeposit +
                ", period=" + period +
                ", additional contribution =" + additionalcontribution  +
                "}";
    }
}



