package git.Easy.LongestPalindromeSubString;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String A="bb";
        int start=0;
        int end=1;
        int right=0;
        int left=0;
        char s='b';
        String ss=""+s;
        for(int i=0;i<A.length();i++){
            right= i;
            left= i-1;
            while(left>=0 && right<A.length() && (A.charAt(left)==A.charAt(right))){
                if((right-left+1)>end){
                    start=left;
                    end=right-left+1;
                }
                left--;
                right++;
            }
            right= i+1;
            left= i-1;
            while(left>=0 && right<A.length() && (A.charAt(left)==A.charAt(right))){
                if((right-left+1)>end){
                    start=left;
                    end=right-left+1;
                }
                left--;
                right++;
            }
        }
       StringBuilder sb=new StringBuilder();
        for(int i=start;i<=end;i++){
            sb.append(A.charAt(i));
        }
        System.out.println(sb);

    }
}
