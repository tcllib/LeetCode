package algorithm.string;

import java.util.*;

/*
NO.15
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int currentNum = nums[i];
            if (currentNum > 0) break;
            if (i != 0 && currentNum == nums[i-1]) continue; //remove duplicates

            int sum = -currentNum;
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[left] + nums[right];
                if (currentSum == sum) {
                    result.add(List.of(currentNum, nums[left], nums[right]));
                    left ++;
                    right --;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (currentSum < sum) {
                    left ++;
                } else {
                    right --;
                }
            }

        }


        return result;
    }
}
