package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass {

    // store duplicate elements

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        integers.addAll(list2);
        integers.set(1, 3);
        System.out.println(integers.get(1));
        System.out.println(integers.lastIndexOf(1));
        System.out.println(integers.toString()); // 1, 2, 1, 3
        System.out.println(integers.size());

        for (int number :
                integers) {
            System.out.println(number + " ");
        }

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
