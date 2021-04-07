package algorithm.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if (digits.isEmpty() || digits == null) {
            return output;
        }
        Map<Character, List<String>> map = Map.of(
                '2', List.of("a","b", "c"),
                '3', List.of("d","e", "f"),
                '4', List.of("g","h", "i"),
                '5', List.of("j","k", "l"),
                '6', List.of("m","n", "o"),
                '7', List.of("p","q", "r","s"),
                '8', List.of("t","u", "v"),
                '9', List.of("w","x", "y", "z")
        );

        char[] numbers = digits.toCharArray();
        output = map.get(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            output = permutation(output, map.get(numbers[i]));
        }

        return output;
    }

    public List<String> permutation(List<String> listA, List<String> listB) {
        List<String> output = new ArrayList<>(listA.size()*listB.size());
        for (String a : listA) {
            for (String b : listB) {
                output.add(String.join("", a, b));
            }
        }

        return output;
    }
}
