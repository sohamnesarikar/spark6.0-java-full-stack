public class NumberDivisible {
    public static void main(String[] args) {
        int num = 14;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 & 5");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 3 or 5");
        }
    }
}
