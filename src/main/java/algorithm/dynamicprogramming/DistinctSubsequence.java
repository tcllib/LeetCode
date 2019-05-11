package algorithm.dynamicprogramming;

public class DistinctSubsequence {
    public int numDistinct(String s, String t) {
        if(s == null && t == null) {
            return 0;
        }

        int[][] dp = new int[s.length() + 1][t.length() + 1];

        dp[0][0] = 1;

        for(int si = 1; si <= s.length(); si++) {
            if(s.charAt(si - 1) == t.charAt(0)) {
                dp[si][1] = dp[si - 1][1] + 1;
            } else {
                dp[si][1] = dp[si - 1][1];
            }
        }

        for(int si = 1; si <= s.length(); si++) {
            for(int ti = 2; ti <= t.length(); ti++) {
                if(si < ti) {
                    dp[si][ti] = 0;
                } else {
                    if(s.charAt(si -1) == t.charAt(ti -1)) {
                        dp[si][ti] = dp[si - 1][ti] + dp[si -1][ti -1];
                    } else {
                        dp[si][ti] = dp[si - 1][ti];
                    }
                }
            }
        }

        return dp[s.length()][t.length()];
    }
}
