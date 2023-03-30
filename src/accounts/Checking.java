package accounts;

public class Checking extends Account {
    private double balance;
    private int acctNumber, memberId;

    public Checking(int memberId, double balance) {
        this.balance = balance;
        this.memberId = memberId;
        Account.latestAcctNum += 1;
        this.acctNumber = Account.latestAcctNum;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public void makeDeposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void makeWithdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Error: Cannot withdraw more than current balance.");
        } else {
            this.balance -= amount;
        }
    }

}
