package Oops;

class BankAccount {
    private int accountNumber = 123456745;
    private double balance;

    void deposit(double amount) {
        if (amount > 0.0) {
            balance = balance + amount;
        }
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
    }

    void getBalance() {
        System.out.println("Account No. " + accountNumber + " has " + balance + " balance.");
    }

}

public class BankTest {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposit(1000);
        bank.getBalance();

        bank.withdraw(100);
        bank.getBalance();
    }
}

