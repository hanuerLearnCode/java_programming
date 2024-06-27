package Leetcode.Interview.Array.TrappingRainWater;

public class Solution {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution s = new Solution();
        System.out.println(s.trap(height));
    }

    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int lMax = 0;
        int rMax = 0;
        int water = 0;

        if (n < 3) {
            return 0;
        }

        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= lMax) {
                    lMax = height[l];
                } else {
                    water += lMax - height[l];
                }
                l++;
            } else {
                if (height[r] >= rMax) {
                    rMax = height[r];
                } else {
                    water += rMax - height[r];
                }
                r--;
            }
        }
        return water;
    }


}
