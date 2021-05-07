package com.company;

public class flipVertical2D {

    public static void main(String[] args) {

        int[][] arr = {{1,0,0},
                      {0,0,1}};
        flipItVerticalAxis(arr);
    }

    public static void flipItVerticalAxis(int[][] matrix) {

        int rows = matrix.length - 1, columns = matrix[0].length - 1;
        int temp = 0;

        for(int i = 0; i <= rows; i++) {
            for(int j = 0; j<= columns/2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns-j];
                matrix[i][columns-j] = temp;
//                System.out.println(matrix[i][columns-j]);
            }
        }
    }
}
