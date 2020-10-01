import java.util.Arrays;

public class bubbleSortArray {
    public static void main(String[] args) {
        int[] arr = {46,6,-2,9,19};
        System.out.println(Arrays.toString(bubbleSortArr(arr)));
    }

    public static int[] bubbleSortArr(int[] arr){
        int t;
        for(int i = 1; i < arr.length; i++) {
            for(int j = arr.length - 1; j >= i; j--) {
                if (arr[j - 1] > arr[j]) {
                    t = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = t;
                }
            }
        } return arr;
    }
}
