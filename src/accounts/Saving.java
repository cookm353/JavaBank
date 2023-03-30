package accounts;

public class Saving extends Account {
    private int acctNumber, memberId;
    private double balance, interest;

    public Saving(int memberId, double balance) {
        Account.latestAcctNum += 1;
        this.acctNumber = Account.latestAcctNum;
        this.memberId = memberId;
        this.balance = balance;
        this.updateInterest();
    }
    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void makeDeposit(double amount) {
        this.balance += amount;
        this.updateInterest();
    }

    @Override
    public void makeWithdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Error: Cannot withdraw more than current balance.");
        } else {
            this.balance -= amount;
        }

        this.updateInterest();
    }

    private void updateInterest() {
        if (this.balance >= 50000) {
            this.interest = 0.03;
        } else {
            this.interest = 0.025;
        }
    }


    public void accrueInterest() {
        double apy = Math.pow((1 + this.interest/12), 12) - 1;
//        double interest = this.balance * apy;
        this.balance += this.balance * apy;
        this.getInterest();
    }

    /* Getters and Setters */

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double apy) {
        this.interest = apy;
    }
}
