package algorithm.string;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> romanMap = Map.ofEntries(
                Map.entry(1000, "M"),
                Map.entry(900, "CM"),
                Map.entry(500, "D"),
                Map.entry(400, "CD"),
                Map.entry(100, "C"),
                Map.entry(90, "XC"),
                Map.entry(50, "L"),
                Map.entry(40, "XL"),
                Map.entry(10, "X"),
                Map.entry(9, "IX"),
                Map.entry(5, "V"),
                Map.entry(4, "IV"),
                Map.entry(1, "I")
        );
        StringBuilder output = new StringBuilder();

        List<Integer> keys = romanMap.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (Integer key : keys) {
            if (num == 0) {
                break;
            }

            int result = num / key;
            if (result != 0) {
                for (int i = 0; i < result; i++) {
                    output.append(romanMap.get(key));
                }

                num = num % key;
            }
        }

        return output.toString();
    }
}
