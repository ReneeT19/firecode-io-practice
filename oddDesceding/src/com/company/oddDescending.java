package com.company;

import java.util.Scanner;

public class oddDescending {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int i = number; i>0; i--) {

        if(i % 2 != 0) {

        int descend = i;

        System.out.println(descend + " ");

        }}
    }
}
