package tut02;

import java.util.Arrays;

public class ex04 {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original array:");
        print2DArray(array2D);

        int[][] transposedArray = transpose(array2D);
        System.out.println("\nTransposed array:");
        print2DArray(transposedArray);
    }

    public static int[][] transpose(int[][] array2D) {
        int R = array2D.length;
        int C = array2D[0].length;
        int[][] transposedArray = new int[C][R];

        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                transposedArray[i][j] = array2D[j][i];
            }
        }

        return transposedArray;
    }

    public static void print2DArray(int[][] array2D) {
        for (int[] row : array2D) {
            for (int element : row) {
                System.out.printf("%2d ", element);
            }
            System.out.println();
        }
    }
}
