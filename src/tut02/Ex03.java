package tut02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        File file = new File("resources/tut02/ex03.txt");
        try {
            Scanner sc = new Scanner(file);
            String name = sc.nextLine();
            System.out.println(name);
            int point1 = sc.nextInt();
            int point2 = sc.nextInt();
            int point3 = sc.nextInt();
            System.out.println((double) (point1 + point2 + point3) / 3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
