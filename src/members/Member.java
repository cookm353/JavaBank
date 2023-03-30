package members;

import accounts.Checking;
import accounts.Saving;
import accounts.Account;

import java.util.HashMap;
import java.util.Map;

public class Member {
    public String name;
    public int memberId;
    private static int latestId = 65000;
    public Map<String, Account> accounts;
    private boolean hasSavingsAccount, hasCheckingAccount;

    public Member(String name) {
        this.name = name;
        this.accounts = new HashMap<String, Account>();

        hasSavingsAccount = false;
        hasCheckingAccount = false;

        Member.latestId += 1;
        this.memberId = latestId;
    }

    public void createSavingAccount() {
        if (hasSavingsAccount) {
            System.out.println("Error: member already has a saving account");
        } else {
            Saving saving = new Saving(this.memberId, 0.0);
            this.accounts.put("saving", saving);
            this.hasSavingsAccount = true;
        }
    }
    public void createSavingAccount(double balance) {
        if (hasSavingsAccount) {
            System.out.println("Error: member already has a saving account");
        } else {
            Saving saving = new Saving(this.memberId, balance);
            this.accounts.put("saving", saving);
            this.hasSavingsAccount = true;
        }
    }

    public void createCheckingAccount() {
        if (hasSavingsAccount) {
            System.out.println("Error: member already has a saving account");
        } else {
            Checking checking = new Checking(this.memberId, 0.0);
            this.accounts.put("checking", checking);
            this.hasCheckingAccount = true;
        }
    }
    public void createCheckingAccount(double balance) {
        if (hasSavingsAccount) {
            System.out.println("Error: member already has a saving account");
        } else {
            Checking checking = new Checking(this.memberId, balance);
            this.accounts.put("checking", checking);
            this.hasCheckingAccount = true;
        }
    }
}
