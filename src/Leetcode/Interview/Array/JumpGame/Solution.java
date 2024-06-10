package Leetcode.Interview.Array.JumpGame;

/**
 * the step is in range from num[start] to num[index]
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4}; // true
        int[] zero = {2, 0}; // true
        int[] one = {1}; // true
        int[] nums2 = {1, 2}; // true
        Solution s = new Solution();
        System.out.println(s.canJump(nums));
        System.out.println(s.canJump(zero));
        System.out.println(s.canJump(one));
        System.out.println(s.canJump(nums2));
    }

    public boolean canJump(int[] nums) {

        int l = nums.length;
        // most steps possible
        int furthest = 0;

        for (int i = 0; i < l; i++) {
            // if the curr pos is larger than the furthest step
            if (i > furthest) {
                return false;
            }
            // else
            furthest = Math.max(furthest, i + nums[i]);
            if (furthest >= l - 1) {
                return true;
            }
        }

        return false;
    }
}
