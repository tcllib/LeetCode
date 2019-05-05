package algorithm;

import java.util.Deque;
import java.util.LinkedList;

/**
 * [239] Sliding Window Maximum
 * Solution from wechat
 */
public class MaxSlidingWindow {
//    public static void main(String[] args) {
//        int[] x = maxSlidingWindow(new int[]{7, 2, 4}, 2);
//        System.out.println(Arrays.toString(x));
//    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] results = new int[nums.length - k + 1];
        Deque<Integer> queue = new LinkedList<>();

        if(nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        for(int i = 0; i < nums.length; i++) {
            while(!queue.isEmpty() && nums[i] > nums[queue.getLast()]) {
                queue.removeLast();
            }

            queue.addLast(i);

            if(queue.getFirst() + k - 1 < i) {
                queue.removeFirst();
            }

            if(i >= k - 1) {
                results[i - k + 1] = nums[queue.getFirst()];
            }
        }

        return results;
    }
}
