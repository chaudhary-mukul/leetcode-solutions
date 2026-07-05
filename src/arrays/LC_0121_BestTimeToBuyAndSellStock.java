package arrays;

/*
 * LeetCode 121 - Best Time to Buy and Sell Stock
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {

            minPrice = Math.min(minPrice, price);

            int profit = price - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}