package git.String;
// Leetcode 5
public class LongestPalindromicSubStringFormula {
    public static void main(String[] args) {
        System.out.println(palindrome("aaaa"));
    }

    public static String palindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            } else {
                return s.substring(0, 1);
            }
        }
        APair pair = new APair(0, 1);
        for (int i = 0; i < s.length(); i++) {
            pair = expand(s, i - 1, i + 1, pair);
            pair = expand(s, i, i + 1, pair);
        }
        return s.substring(pair.getStart(), pair.getStart() + pair.getEnd());// as the end contains length of palindrome we need to add start and end to find the correct last position of substring
        // but the last position is exclusive we will always have the (start+end) as (actualValue+1) so we will not lose the last element or get any out of bound exception
    }

    public static APair expand(String s, int left, int right, APair pair) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (right - left + 1 > pair.getEnd()) { //R-L+1 is the length of the substring ,if the existing length of palindrome(end) is less than new length of pali.. update end and start
                pair = new APair(left, right - left + 1);
            }
            left--;
            right++;
        }
        return pair;
    }

    static class APair {
        private int start = 0;
        private int end = 1;

        public APair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return this.start;
        }

        public int getEnd() {
            return this.end;
        }
    }
}
