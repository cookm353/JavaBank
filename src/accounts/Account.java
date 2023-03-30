package accounts;

public abstract class Account {

    static int latestAcctNum = 1000000;

    public abstract double checkBalance();
    public abstract void makeDeposit(double amount);

    public abstract void makeWithdrawal(double amount);
}
