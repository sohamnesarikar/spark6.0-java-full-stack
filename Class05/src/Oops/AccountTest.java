package Oops;

class Account {
    void calculateInterest() {
        System.out.println("Account interest calculated");
    }
}

class SavingAccount extends Account {
    @Override
    void calculateInterest() {
        System.out.println("Saving account interest calculated");
    }

}

class CurrentAccount extends Account {
    @Override
    void calculateInterest() {
        System.out.println("Current account interest calculated");
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new SavingAccount();
        a1.calculateInterest();
        
        Account a2 = new CurrentAccount();
        a2.calculateInterest();
    }

}
