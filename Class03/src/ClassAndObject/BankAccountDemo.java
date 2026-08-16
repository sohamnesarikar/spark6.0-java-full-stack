class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;
}


public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.accountHolder = "John Doe";
        bank.accountNumber = "4435 2674 8762";
        bank.balance = 3000;

        System.out.println("Account Holder: " + bank.accountHolder);
        System.out.println("Account Number: " + bank.accountNumber);
        System.out.println("Balance: " + bank.balance);

    }
}
