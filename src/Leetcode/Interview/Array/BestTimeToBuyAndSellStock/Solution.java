package Leetcode.Interview.Array.BestTimeToBuyAndSellStock;

public class Solution {

    public static void main(String[] args) {
        int[] prices = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9};
        int[] prices2 = {7, 1, 5, 3, 6, 4};
        int[] prices3 = {7, 6, 4, 3, 1};
        Solution s = new Solution();
        System.out.println(s.maxProfit(prices3));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int thisProfit;
        int l = prices.length;
        int pointer = 0;
        while (pointer < l) {
            for (int i = pointer + 1; i < l; i++) {
                if (prices[pointer] > prices[i]) {
                    break;
                }
                thisProfit = prices[i] - prices[pointer];
                if (thisProfit > maxProfit) {
                    maxProfit = thisProfit;
                }
            }
            pointer++;
        }

        return maxProfit;
    }

    public int maxProfit2(int[] prices) {

        int minPrice = prices[0];
        int l = prices.length;
        int maxProfit = 0;
        for (int i = 1; i < l; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
}
