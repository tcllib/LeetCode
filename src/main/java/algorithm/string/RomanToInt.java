package algorithm.string;

import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        int output = 0;
        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character current = chars[i];
            Character next = i + 1 <chars.length ? chars[i+1] : null;

            int currentValue = getValueByCurrentAndNext(current, next, romanMap);
            output += currentValue;
        }

        return output;
    }

    private int getValueByCurrentAndNext(Character current, Character next, Map<Character, Integer> romanMap) {
        Integer currentInt = romanMap.get(current);
        if (next != null && currentInt < romanMap.get(next)) {
            return -currentInt;
        }

        return currentInt;
    }
}
