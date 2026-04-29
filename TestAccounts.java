import java.util.*;

class GeneralBankAccount {
    String accountNumber, accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { balance -= amt; }
    void checkBalance() { System.out.println("Balance: " + balance); }
}

class SavingAccount extends GeneralBankAccount {
    void calculateInterest(double rate) {
        System.out.println("Interest: " + (balance * rate / 100));
    }
}

class FixedDepositAccount extends GeneralBankAccount {
    void maturityAmount(double rate, int years) {
        System.out.println("Maturity: " + (balance + (balance * rate * years / 100)));
    }
}

public class TestAccounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount sa = new SavingAccount();
        sa.openAccount(sc.next(), sc.next(), sc.nextDouble());
        sa.calculateInterest(sc.nextDouble());

        FixedDepositAccount fa = new FixedDepositAccount();
        fa.openAccount(sc.next(), sc.next(), sc.nextDouble());
        fa.maturityAmount(sc.nextDouble(), sc.nextInt());
    }
}
