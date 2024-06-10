package Leetcode.Interview.Array.RotateArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        Solution s = new Solution();
        s.rotateWithReverse(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int[] tmp = new int[l];

        for (int i = 0; i < l; i++) {
            int posInTmp = (i + k) % l;
            tmp[posInTmp] = nums[i];
        }
    }

    public void rotateWithReverse(int[] nums, int k) {
        int l = nums.length;

        k %= l;

        nums = reverse(nums, 0, l - 1);
        nums = reverse(nums, 0, k - 1);
        nums = reverse(nums, k, l - 1);
    }

    public int[] reverse(int[] nums, int start, int end) {

        while (start < end) {

            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;

            start++;
            end--;
        }

        return nums;
    }

}
