package com.company;

public class Palindrome {

    public static boolean isStringPalindrome(String str){

        if(str == null || str.equals("")) {
            return true;
        }

        int a = 0;
        int b = str.length()-1;
        while(b>a) {
            if(str.charAt(a)!=str.charAt(b)) {
                return false;
            } else {
                a++;
                b--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("ABCDE"));
        System.out.println(isStringPalindrome("mcacm"));
    }
}
