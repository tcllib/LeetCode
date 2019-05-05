package algorithm;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-10));
        System.out.println(isPalindrome(100));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(12));
    }

    public static boolean isPalindrome(int x) {
        return x >= 0 && getReverseNumber(x) == x;
    }

    public static Integer getReverseNumber(int x) {
        int reverse = 0;
        for(; x != 0; x/=10) {
            reverse = reverse*10 + x%10;
        }

        return reverse;
    }
}
