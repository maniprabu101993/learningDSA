package git.String;
// Leetcode 5
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaa"));
    }
    public static String longestPalindrome(String s) {
        String ans="";
        int maxLength=0;
        if(s.length()==1){
            return s;
        }
        for(int i=0;i<s.length();i++){//4
            String oddLengthString=expandLeftRight(s,i-1,i+1);//i=0 -1,1 |i=1 0,2 |i=2 1,3
            String evenLengthString=expandLeftRight(s,i,i+1);//i=0 1,2 |i=1 1,2 |i=2 2,3
            int oddLength=oddLengthString.length();
            int evenLength= evenLengthString.length();
            int currentMaxLength= Math.max(oddLength,evenLength);
            if(currentMaxLength>maxLength){
                if(oddLength>evenLength){
                    ans= oddLengthString;
                }
                else{
                    ans=evenLengthString;
                }
            }
            maxLength=currentMaxLength;
        }
        if(ans.isEmpty()){
            ans= s.substring(0,1);
        }
        return ans;
    }

    public static String expandLeftRight(String s,int left,int right){//1,2
        String localPalindrome="";
        while(left>=0 && right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                if(right-left==2){
                    localPalindrome=localPalindrome+s.charAt(right-1);
                }
                localPalindrome= s.charAt(left)+localPalindrome+s.charAt(left);
            }else{
                break;
            }
            left--;
            right++;
        }
        return localPalindrome;
    }
}
