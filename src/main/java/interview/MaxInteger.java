package interview;

public class MaxInteger {
    public static int solution(int N) {
        if (N >= 0) {
            return getPositiveMax(N);
        } else {
            return getNegativeMax(N);
        }
    }

    private static int getNegativeMax(int n) {
        String intString = Integer.toString(-n);
        String[] bitString = intString.split("");
        for (int i = 0; i < bitString.length; i++) {
            String bit = bitString[i];
            if(Integer.valueOf(bit) > 5) {
                return -insertFiveAt(intString, i);
            }
        }

        return -Integer.valueOf(intString + "5");
    }

    public static int insertFiveAt(String s, int position) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.substring(0, position)).append("5").append(s.substring(position));
        return Integer.valueOf(stringBuilder.toString());
    }

    private static int getPositiveMax(int n) {
        String intString = Integer.toString(n);
        String[] bitString = intString.split("");
        for (int i = 0; i < bitString.length; i++) {
            String bit = bitString[i];
            if(Integer.valueOf(bit) < 5) {
                return insertFiveAt(intString, i);
            }
        }

        return Integer.valueOf(intString + "5");
    }

    public static void main(String[] args) {
        System.out.println(solution(-123));
    }
}
