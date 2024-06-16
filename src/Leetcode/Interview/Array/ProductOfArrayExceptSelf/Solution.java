package Leetcode.Interview.Array.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution s = new Solution();
//        System.out.println(Arrays.toString(s.productExceptSelf(nums)));

        int[] optimized = s.third(nums);
        System.out.println(Arrays.toString(optimized));
    }

    // TLE
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                product *= nums[j];
            }
            answers[i] = product;
        }

        return answers;
    }

    // TLE
    public int[] optimizedProductExceptSelf(int[] nums) {
        int n = nums.length;

        int[] products = new int[n];

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            int product = 1, leftProduct = 1, rightProduct = 1;
            while (left < i) {
                leftProduct *= nums[left];
                left++;
            }
            while (right > i) {
                rightProduct *= nums[right];
                right--;
            }
            product = leftProduct * rightProduct;
            products[i] = product;
        }

        return products;
    }

    // claude
    public int[] third(int[] nums) {

        int n = nums.length;
        int[] products = new int[n];

        // loop forwards to calculate the left-side product
        products[0] = 1;
        for (int i = 1; i < n; i++) {
            products[i] = products[i - 1] * nums[i - 1];
        }

        // loop backwards to calculate the right-side product
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            products[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return products;
    }

}
