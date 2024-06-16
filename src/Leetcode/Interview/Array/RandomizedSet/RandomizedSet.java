package Leetcode.Interview.Array.RandomizedSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomizedSet {

    protected Set<Integer> nums;

    public RandomizedSet() {
        nums = new HashSet<>();
    }

    public boolean insert(int val) {
        if (nums.contains(val)) return false;
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (nums.contains(val)) {
            nums.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int n = nums.size();
        int target = (int) (Math.random() * n);
        List<Integer> list = new ArrayList<>(nums);
        return list.get(target);
    }

    @Override
    public String toString() {
        return "RandomizedSet{" + "nums=" + nums + '}';
    }
}


