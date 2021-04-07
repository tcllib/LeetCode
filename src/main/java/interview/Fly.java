package interview;

public class Fly {
    public String[][] test(String [][] input) {
        Integer length = Integer.parseInt(input[0][0]);
        Integer height = Integer.parseInt(input[0][0]);
        String[][] output = new String[length][height];

        int count = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < length; j++) {
                String s = input[count][0];
                output[i - 1][i%2 == 1 ? j : length - j - 1] = s;
                count++;
            }

        }

        return output;
    }
}
