package javaQuestions;

public class CheckPalindromeForLoop {
    public static boolean isPalindrome(String str) {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "level";
        System.out.println(word + " is Palindrome: " + isPalindrome(word));
    }
}

