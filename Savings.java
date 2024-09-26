public  class Savings extends ACCOUNTADT {
    int initialdeposit;
    int period;
    int additionalcontribution;

    public Savings(int ACCOUNTbalance, double interestRate,int initialdeposit,int period, int additionalcontribution ) {

        super(ACCOUNTbalance, interestRate, "Savings");
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
                ", accountType='" + getACCOUNtype() +
                ", accountBalance=" + getACCOUNTbalance() +
                ", interestRate=" + getInterestRate() +
                ", initial deposit=" + initialdeposit +
                ", period=" + period +
                ", additional contribution =" + additionalcontribution  +
                "}";
    }
}




