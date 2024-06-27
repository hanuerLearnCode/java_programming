package Algorithms.Searching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {2, 4, 56, 7, 8, 10};

        LinearSearch ls = new LinearSearch();

        long startTime = System.currentTimeMillis();

        System.out.println(ls.linearSearch(nums, 3));

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " milliseconds");

    }

    public int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
