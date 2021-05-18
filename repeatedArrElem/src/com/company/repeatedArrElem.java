package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class repeatedArrElem {

    public static String duplicate(int[] numbers){

        ArrayList<Integer> duplicates = new ArrayList<>();

        TreeSet<String> ts = new TreeSet<>();

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            if(!ts.add(String.valueOf(numbers[i]))) {
                duplicates.add(numbers[i]);
            }
        }
        return duplicates.toString();
    }

    public static void main(String[] args) {
	// write your code here
        int[] testArray = new int[5];
        testArray[0] = 5;
        testArray[1] = 5;
        testArray[2] = 1;
        testArray[3] = 2;
        testArray[4] = 1;
        System.out.println(duplicate(testArray));
    }
}
