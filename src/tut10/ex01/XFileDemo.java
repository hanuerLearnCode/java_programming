package tut10.ex01;

import java.util.ArrayList;
import java.util.List;

public class XFileDemo {
    public static void main(String[] args) {
        byte[] data = XFile.read("./resources/XFileTest.txt");
        XFile.write("./resources/XFileWrite.txt", data);

        List<Student> sList = new ArrayList<>();
        sList.add(new Student("A", 5, "FIT"));
        sList.add(new Student("B", 3, "ED"));
        sList.add(new Student("C", 2, "C"));

        XFile.writeObject("./resources/XFileWrite.txt", sList);
    }
}
