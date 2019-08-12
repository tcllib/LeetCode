package interview;

public class Forum {
    public static String solution(String message, int K) {
        if (message.length() <= K) {
            return message;
        }

        String[] splitMessages = message.split(" ");
        StringBuilder output = new StringBuilder();

        String firstMessage = splitMessages[0];
        if(firstMessage.length() <= K) {
            output.append(firstMessage);
            K -= firstMessage.length();
        }

        for(int i = 1; i < splitMessages.length; i++) {
            String nextMessage = splitMessages[i];
            K -= nextMessage.length() + 1;

            if (K < 0) {
                break;
            } else {
                output.append(" ").append(nextMessage);
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Codility We", 1));
    }
}
