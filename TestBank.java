import java.util.*;

class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    void calculateAndDisplayInterest() {
        System.out.println("Interest: " + (balance * interest_rate / 100));
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(sc.next(), sc.nextDouble());
        acc.calculateAndDisplayInterest();
        BankAccount.updateInterestRate(sc.nextDouble());
        acc.calculateAndDisplayInterest();
    }
}
