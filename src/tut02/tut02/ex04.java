package tut02.tut02;

import java.util.Arrays;

public class ex04 {
    public static void main(String[] args) {

        int[][] firstMatrix = {
                {1,2,3},
                {3,4,5}
        };
        int[][] result = transposeMatrix(firstMatrix, 2,3);
        printMatrix(result);
//        System.out.println(Arrays.deepToString(result));
    }

    static int[][] transposeMatrix(int[][] firstMatrix, int row, int col) {
        int[][] result = new int[col][row];
//        firstMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = firstMatrix[i][j];
            }
        }
        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length-1; j++) {
                System.out.println("{" + ints[j] + " " + ints[j + 1] + "}");
            }
        }
    }
}
