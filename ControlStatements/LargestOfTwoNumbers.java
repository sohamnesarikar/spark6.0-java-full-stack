public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 40;

        if (num1 > num2) {
            System.out.println(num1 + " is Greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
