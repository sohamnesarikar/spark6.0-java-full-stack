public class NumberService {

    int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberService ns = new NumberService();
        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("Sum: " + ns.calculateSum(arr));
    }
}
