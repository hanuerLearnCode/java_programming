import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = 10;
        Main m = new Main();
        for (int i = 0; i < n; i++) {
            System.out.println(m.fibonacci(i) + " ");
        }
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        // 0 1 1 2 3 5
        return fibonacci(n-1) + fibonacci(n-2);
    }
}