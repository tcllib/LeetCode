package algorithm.dynamicprogramming;

/**
 * [121] Best Time to Buy and Sell Stock
 */
public class MaxProfitI {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int [] dp = new int[prices.length];

        dp[0] = 0;
        int min = prices[0];
        for(int i = 1; i <= prices.length - 1; i++) {
            if(prices[i] < min) {
                min = prices[i];
                dp[i] = dp[i-1];
            } else {
                int newProfit = prices[i] - min;
                dp[i] = newProfit > dp[i-1] ? newProfit : dp[i-1];
            }
        }

        return dp[prices.length - 1];
    }
}
