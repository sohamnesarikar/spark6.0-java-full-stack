public class EvenOddNumbers {
    public static void main(String[] args) {
        // even numbers
        System.out.println("----------Even Numbers------------");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // odd numbers
        System.out.println("-----------Odd Numbers-------------");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
