package Leetcode.Interview.Array.BestTimeToBuyAndSellStockII;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * On each day, you may decide to buy and/or sell the stock.
 * <p>
 * You can only hold at most one share of the stock at any time.
 * <p>
 * However, you can buy it then immediately sell it on the same day.
 * <p>
 * Find and return the maximum profit you can achieve.
 */

import java.util.ArrayList;

/**
 * Example 1: <br>
 * <p>
 * Input: prices = [7,1,5,3,6,4] <br>
 * Output: 7 <br>
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4. <br>
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3. <br>
 * Total profit is 4 + 3 = 7. <br>
 * Example 2: <br>
 * <p>
 * Input: prices = [1,2,3,4,5] <br>
 * Output: 4 <br>
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4. <br>
 * Total profit is 4. <br>
 * Example 3: <br>
 * <p>
 * Input: prices = [7,6,4,3,1]<br>
 * Output: 0<br>
 * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.<br>
 */
public class Solution {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5};
        Solution s = new Solution();
        System.out.println("totalProfit: " + s.totalProfit(prices));
        System.out.println("maxProfit: " + s.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = prices.length;

        for (int i = 1; i < l - 1; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }

        }
        return maxProfit;
    }

    public int totalProfit(int[] prices) {
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }
}
