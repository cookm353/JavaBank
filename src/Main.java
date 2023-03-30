import accounts.Account;
import accounts.Saving;
import members.Member;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Member john = new Member("John");
        System.out.println(john.memberId);

        john.createSavingAccount(5000);
        Saving johnSavings = (Saving) john.accounts.get("saving");
        double savingsBalance = johnSavings.checkBalance();
        System.out.println(savingsBalance);
        johnSavings.accrueInterest();
        savingsBalance = johnSavings.checkBalance();
        System.out.println(savingsBalance);
    }
}
