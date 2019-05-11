package algorithm.dynamicprogramming;

/**
 * [70] Climbing Stairs
 * one variable dp which is actually fibonacci sequence
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }

        if(n == 2) {
            return 2;
        }

        int result = 0;
        int last = 2;
        int beforeLast = 1;
        for (int i = 3; i <= n; i++) {
            result = last + beforeLast;
            beforeLast = last;
            last = result;
        }

        return result;
    }
}
