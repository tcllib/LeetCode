package algorithm.dynamicprogramming;

/**
 * [10] Regular Expression Matching
 * Use dynamic programming https://www.youtube.com/watch?v=DqhPJ8MzDKM
 */
public class RegularExpression {
    public boolean isMatch(String s, String p) {
        if(s == null && p == null) {
            return true;
        }

        boolean[][] dp = new boolean [s.length() + 1][p.length() + 1];

        dp[0][0] = true;
        for(int i = 1; i <= p.length(); i++) {
            if(p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i-2];
            }
        }

        for(int si = 1; si <= s.length(); si++) {
            for(int pi = 1; pi <= p.length(); pi++) {
                if(p.charAt(pi - 1) == '*') {
                    dp[si][pi] = dp[si][pi - 2] || ((s.charAt(si - 1) == p.charAt(pi - 2) || p.charAt(pi -2) == '.') && dp[si - 1][pi]);
                } else {
                    dp[si][pi] = (s.charAt(si -1) == p.charAt(pi - 1) || p.charAt(pi - 1) == '.') && dp[si - 1][pi - 1];
                }
            }
        }

        return dp[s.length()][p.length()];
    }
}
