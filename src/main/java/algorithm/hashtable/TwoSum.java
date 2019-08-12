package algorithm.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new Hashtable<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if(map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }

            map.put(complement, i);
        }

        return null;
    }

    public static void main(String[] args) {
        boolean result = rotateString("abcde", "abced");
        System.out.println(result);
    }

    public static boolean rotateString(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();

        if (lengthA != lengthB || lengthA == 0){
            return false;
        }

        search:
        for(int i = 0; i < lengthA; i++){
            for (int j = 0; j < lengthA; j++){
                if(A.charAt((j+i)%lengthA) != B.charAt(j))
//                    continue;
                    continue search;
            }
            return true;
        }

        return false;
    }
}
