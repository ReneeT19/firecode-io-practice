package com.company;

public class binaryIntArr {

    public static void main(String[] args) {
	// write your code here
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = 10;
        binaryIntArr ob = new binaryIntArr();
        int result = ob.binarySearch(arr,n);
        System.out.println(binarySearch(arr,n) + " index: " + result);
    }
    //you can make this method Boolean by chaning return m to return true and return -1 to return false
    public static int binarySearch(int[] arr, int n){

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == n)
                return m;

            // If x greater, ignore left half
            if (arr[m] < n)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;

    }
}
