package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int arr[] = {12, 45, 23, 67, 34};
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max element from an array: "+max);
    }

}
