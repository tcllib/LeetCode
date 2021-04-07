package algorithm.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {
    public String reverseWords(String s) {
        String trimmedWord = s.trim();
        List<String> split = Arrays.asList(trimmedWord.split("\\s+"));
        Collections.reverse(split);
        return String.join(" ", split);
    }
}
