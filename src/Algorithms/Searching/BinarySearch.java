package Algorithms.Searching;

import java.util.Arrays;

/**
 * Only works with sorted array
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {10, 2, 3, 4, 6, 7, 12, 13, 20, 50, 40, 30};
        int target = 13;

        BinarySearch bn = new BinarySearch();

        System.out.println("recursive: " + bn.recursive(nums, target, 0, nums.length - 1));
        System.out.println("normal: " + bn.normal(nums, target));
    }

    public int normal(int[] nums, int target) {

        Arrays.sort(nums);

        int n = nums.length;
        int start = 0;
        int end = n - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return -1;
    }

    public int recursive(int[] nums, int target, int start, int end) {

        Arrays.sort(nums);


        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                return recursive(nums, target, start, mid - 1);
            } else {
                return recursive(nums, target, mid + 1, end);
            }

        }

        return -1;
    }
}
