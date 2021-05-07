package com.company;

public class findMissingNum {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,2,3,4,5,6,7,9,10};
        System.out.println(findMissingNumber(arr, arr.length));
    }

    public static int findMissingNumber(int[] arr, int n) {

        int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total += i;
            total -= arr[i - 2];
        }
        return total;
    }
}
