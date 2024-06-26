package Leetcode.Interview.Array.Candy;


import java.util.Arrays;

public class Solution {

    /**
     * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
     * <p>
     * You are giving candies to these children subjected to the following requirements:
     * <p>
     * Each child must have at least one candy.
     * <p>
     * Children with a higher rating get more candies than their neighbors.
     * <p>
     * Return the minimum number of candies you need to have to distribute the candies to the children.
     */
    public static void main(String[] args) {
        int[] case1 = {1, 0, 2};
        int[] case2 = {1, 2, 2};
        int[] case6 = {1, 3, 2, 2, 1}; // expect: 7
        int[] case11 = {1, 2, 87, 87, 87, 2, 1}; // expect: 13
        Solution s = new Solution();
        System.out.println(s.candy(case11));
    }

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int total = 0;
        for (int candy : candies) {
            total += candy;
        }

        return total;
    }

}
