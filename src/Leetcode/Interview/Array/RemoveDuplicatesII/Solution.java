package Leetcode.Interview.Array.RemoveDuplicatesII;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(Solution.removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        int k = 1;
        int count = 1; // number of appearance

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (count < 2) {
                    nums[k++] = nums[i];
                    count++;
                }
            } else {
                nums[k++] = nums[i];
                count = 1;
            }
        }

        return k;
    }

}
