package algorithm.string;

import java.util.ArrayList;
import java.util.List;

public class RestoreIp {
    public List<String> restoreIpAddresses(String s) {
        return helper(s, 3);
    }

    private List<String> helper(String s, int dotsLeft) {
        if (dotsLeft == 0 && isValidRange(s)) {
            return List.of(s);
        }

        if (dotsLeft == 0 && !isValidRange(s)) {
            return List.of();
        }

        List<String> output = new ArrayList<>();

        for (int dotIndex = 1; dotIndex <= 3 && s.length() >= dotIndex; dotIndex++) {
            String header = s.substring(0, dotIndex);
            if (isValidRange(header)) {
                List<String> all = helper(s.substring(dotIndex), dotsLeft-1);
                for (String right : all) {
                    output.add(String.format("%s.%s", header, right));
                }
            }
        }

        return output;
    }

    private boolean isValidRange(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        if (s.length() == 1) {
            return true;
        }

        return !s.startsWith("0") && Integer.parseInt(s) <= 255;
    }
}
