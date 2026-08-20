public class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
    }

    void withdraw(double amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance: Amount is larger than total balance");
        }
    }

    void displayBalance() {
        System.out.println(accountHolder + " Total Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.accountHolder = "John Doe";
        bank.deposit(1000);
        bank.displayBalance();

        bank.withdraw(250);
        bank.displayBalance();

        bank.withdraw(800);
        bank.displayBalance();
    }
}
