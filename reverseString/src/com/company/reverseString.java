package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseString {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseString("abc"));
    }

    public static String reverseString(String str){
    //using basic core Java
//        if(str == null || str.equals("")) return str;
//        char[] in = str.toCharArray();
//        int begin=0;
//        int end=in.length-1;
//        char temp;
//        while(end>begin){
//            temp = in[begin];
//            in[begin]=in[end];
//            in[end] = temp;
//            end--;
//            begin++;
//        }
//
//        return new String(in);

    //using ArrayList and .reverse()
        List<Character> list = new ArrayList<Character>();
        for(char c: str.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder(list.size());
        for(Character c: list) {
            builder.append(c);
        }
        return builder.toString();
    }
}
