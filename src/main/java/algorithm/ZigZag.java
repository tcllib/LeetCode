package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1)
            return s;

        List<StringBuilder> rows = new ArrayList();

        for(int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        int indicator = -1;

        for(char c: s.toCharArray()) {
            rows.get(currentRow).append(c);
            if(currentRow == 0 || currentRow == numRows - 1) {
                indicator *= -1;
            }

            currentRow += indicator;
        }

        StringBuilder output = new StringBuilder();
        for(StringBuilder row: rows) {
            output.append(row);
        }

        return output.toString();
    }
}
