package com.company;

public class reverseString {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseString("abc"));
    }

    public static String reverseString(String str){

        if(str == null) return null;
        char[] in = str.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }

        return new String(in);

    }
}
