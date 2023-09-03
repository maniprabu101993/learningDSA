package git.Easy.usingFormula;

public class LongestConsecutive1s {
    public static void main(String[] args) {
        String s="11010110000000000";
        System.out.println(solve(s));
    }
    public static int solve(String A) {
        int N=A.length();
        int maxOnes=0;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=Character.getNumericValue((A.charAt(i)));
        }
        if(sum==N){
            return N;
        }
        for(int i=0;i<N;i++){
            if(Character.getNumericValue(A.charAt(i)) ==0){
                int left=0;
                int right=0;
                for(int j=i-1;j>=0;j--){
                    if(Character.getNumericValue(A.charAt(j)) ==1){
                        left++;
                    }else{
                        break;
                    }
                }
                for(int k=i+1;k<N;k++){
                    if(Character.getNumericValue(A.charAt(k)) ==1){
                        right++;
                    }else{
                        break;
                    }
                }
                maxOnes=Math.max(maxOnes,(left+right+1));
            }
        }
        return maxOnes;
    }
}
