public class SimpleATMWithdrawal {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawAmount = 2000;

        if (withdrawAmount <= balance) {
            System.out.println("Withdrawal Successfull");
            System.out.println("Remaining balance: " + (balance - withdrawAmount));
        } else {
            System.out.println("Insufficient balance");
        }
    }
}