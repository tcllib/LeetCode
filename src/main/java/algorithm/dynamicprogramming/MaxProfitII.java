package algorithm.dynamicprogramming;

/**
 * [122] Best Time to Buy and Sell Stock II
 */
public class MaxProfitII {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }

        int[] dp = new int[prices.length];

        dp[0] = 0;
        for(int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i-1];
            if(profit > 0) {
                dp[i] = dp[i-1] + profit;
            } else {
                dp[i] = dp[i-1];
            }
        }

        return dp[prices.length - 1];
    }
}
