public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 74;
        int num2 = 50;
        int num3 = 25;

        if ((num1 == num2) && (num2 == num3)) {
            System.out.println("All numbers are equal");
        } else if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("num1 is Greater");
        } else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.println("num2 is greater");
        } else {
            System.out.println("num3 is Greater");
        }
    }
}
