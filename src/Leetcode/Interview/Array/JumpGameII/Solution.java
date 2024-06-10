package Leetcode.Interview.Array.JumpGameII;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4}; // 2
        int[] zero = {1}; // 0
        int[] case19 = {0}; // 0
        int[] case41 = {1, 2, 1, 1, 1}; // 4
        Solution s = new Solution();
        System.out.println(s.jump(nums));
        System.out.println(s.jump(zero));
        System.out.println(s.jump(case19));
        System.out.println(s.jump(case41));
    }

    public int jump(int[] nums) {

        int l = nums.length;
        int jumps = 0;
        int furthest = 0;
        int range = 0;

        if (l <= 1) return 0;

        // the last index does not need to jump
        for (int i = 0; i < l - 1; i++) {
            // update the furthest reachable at this index
            furthest = Math.max(furthest, i + nums[i]);

            // if the current range is reachable
            if (i == range) {
                // make a jump
                jumps++;
                // update the range to be the furthest so far
                range = furthest;

                // if the range is larger than the l - 1, or we cant reach the second last index
                if (range >= l - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
}
