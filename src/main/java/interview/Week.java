package interview;

public class Week {
    public static String solution(String S, int K) {
        WeekEnum weekEnum = WeekEnum.valueOf(S);
        int newOrdinal = (weekEnum.ordinal() + K) % 7;


        return WeekEnum.values()[newOrdinal].toString();
    }

    public enum WeekEnum {
        Mon, Tue, Wed, Thu, Fri, Sat, Sun;
    }

    public static void main(String[] args) {
        System.out.println(solution("Mon", 8));
    }
}
