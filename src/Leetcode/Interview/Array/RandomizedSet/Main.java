package Leetcode.Interview.Array.RandomizedSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        RandomizedSet rdSet = new RandomizedSet();
        System.out.println("Before operations: " + rdSet);
        if (rdSet.insert(1)) {
            System.out.println(true);
        }
        if (rdSet.insert(2)) {
            System.out.println("After insertion: " + rdSet);
        }
        if (rdSet.insert(2)) {
            System.out.println("After insertion: " + rdSet);
        }
        if (rdSet.remove(2)) {
            System.out.println("After removal: " + rdSet);
        }
        if (rdSet.insert(2)) {
            System.out.println("After insertion: " + rdSet);
        }
        System.out.println(rdSet.getRandom());
        if (rdSet.remove(2)) {
            System.out.println("After removal: " + rdSet);
        }
        System.out.println(rdSet.getRandom());
    }
}