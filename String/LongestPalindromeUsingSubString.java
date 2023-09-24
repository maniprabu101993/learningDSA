package git.String;
// Leetcode 5
public class LongestPalindromeUsingSubString {
    public static void main(String[] args) {
        System.out.println(palindrome("aaaa"));
    }

    public static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);//here as we are decrementing the left first , because of this it may go to -1 , so we are adding +1 to make it as 0.
        // and no need to add +1 for right as it will be already incremented from the expected position ,substring of end will be exclusive of the given end position
    }

    public static String palindrome(String s) {
        int maxLength = 1;
        String maxString = "";
        for (int i = 0; i < s.length(); i++) {
            String oddLengthString = expand(s, i - 1, i + 1);
            if (maxLength < oddLengthString.length()) {
                maxLength = oddLengthString.length();
                maxString = oddLengthString;
            }
            String evenLengthString = expand(s, i, i + 1);
            if (maxLength < evenLengthString.length()) {
                maxLength = evenLengthString.length();
                maxString = evenLengthString;
            }
        }
        return maxString;
    }
}
