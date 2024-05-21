package tut02.tut02;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) throws FileNotFoundException {

        File data = new File("resources/tut02/ex03.txt");
        Scanner reader = new Scanner(data);
        StringBuilder name = new StringBuilder();
        ArrayList<Integer> points = new ArrayList<>();
        while (reader.hasNext()) {
            name.append(reader.nextLine());
            points.add(reader.nextInt());
        }
        int sum = 0;
        double avg;
        for (int point : points) {
            sum += point;
        }
        avg = (double) sum /points.size();
        System.out.println("Name: " + name);
        System.out.println("Avg: " + avg);
    }
}
