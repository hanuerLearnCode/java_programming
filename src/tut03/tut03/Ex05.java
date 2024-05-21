package tut03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("resources/data.txt"));

            // Read the number of employees
            int N = scanner.nextInt();

            // Arrays to store the time needed for each employee to complete Work A and B
            int[] A = new int[N];
            int[] B = new int[N];

            // Read the input for each employee
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
                B[i] = scanner.nextInt();
            }

            // Calculate the shortest possible time
            int shortestTime = calculateShortestTime(A, B);

            // Print the result
            System.out.println(shortestTime);

            // Close the scanner
            scanner.close();

//            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error reading data from file: " + e.getMessage());
        }
    }

    private static int calculateShortestTime(int[] A, int[] B) {
        int shortestTime = Integer.MAX_VALUE;

        // Check all possible combinations of assigning works to different employees
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (i != j) {
                    int time = Math.max(A[i], B[j]);
                    shortestTime = Math.min(shortestTime, time);
                }
            }
        }

        return shortestTime;
    }
}

