package Arrays;

public class EvenOddCount {
    public static void main(String[] args) {
        int arr[] = {12, 45, 74, 33, 90};
        int evenCount = 0;
        int oddCount = 0;

        for(int data: arr){
            if(data % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Even: "+ evenCount);
        System.out.println("Odd: "+oddCount);
    }
}
