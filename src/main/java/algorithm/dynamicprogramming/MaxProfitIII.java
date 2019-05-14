package algorithm.dynamicprogramming;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * [123] Best Time to Buy and Sell Stock III
 */
public class MaxProfitIII {
    public int maxProfit(int[] prices) {
//        if (prices.length == 0) {
//            return 0;
//        }
//
//        int[][] dp = new int[prices.length][2];
//        dp[0][0] = 0;
//        dp[0][1] = 0;
//
//        int min1 = prices[0];
//        int min2 = Integer.MAX_VALUE;
//
//        for (int i = 1; i < prices.length; i++) {
//            if(prices[i] < min1) {
//                min1 = prices[i];
//                dp[i][0] = dp[i-1][0];
//                dp[i][1] = Math.max(dp[i-1][1], dp[i][0]);
//            } else {
//                int profit1 = prices[i] - min1;
//                if(profit1 > dp[i-1][0]) {
//                    dp[i][0] = profit1;
//                    int profit2 = prices[i] - min2 + dp[i-1][0];
//                    if(profit2 > dp[i-1][1]) {
//                        dp[i][1] = profit2;
//                    } else {
//                        dp[i][1] = Math.max(dp[i-1][1], dp[i][0]);
//                        min2 = prices[i];
//                    }
//                } else {
//                    dp[i][0] = dp[i-1][0];
//                    dp[i][1] = Math.max(dp[i-1][1], dp[i][0]);
//                    min2 = Math.min(prices[i],min2);
//                }
//            }
//        }
//
//        return dp[prices.length-1][1];

        if (prices.length == 0) {
            return 0;
        }

        int buy1 = prices[0];
        int sell1 = 0;
        int buy2 = prices[0];
        int sell2 = 0;
        for(int i = 1; i < prices.length; i++) {
            buy1 = Math.min(buy1, prices[i]);
            sell1 = Math.max(sell1, prices[i] - buy1);
            buy2 = Math.min(buy2, prices[i] - sell1);
            sell2 = Math.max(sell2, prices[i] - buy2);
        }

        return sell2;
    }
}
