package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapClass {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("B", 10);
        students.put("A", 3);

        // cach 1
        Set<String> keys = students.keySet();
        for (String name : keys) {
            System.out.println("Name: " + name);
        }

        // cach 2
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            String name = entry.getKey();
            int point = entry.getValue();
            System.out.println(name + " " + point);
        }


    }
}
