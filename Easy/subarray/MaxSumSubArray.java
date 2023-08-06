package git.Easy.subarray;

public class MaxSumSubArray {
    /*
    *The same method used by find sum of subarray is used here
    * just maintaining a maxSum variable to find the maximum sum of all subarrays
    * Time complexity for this program is O(N^2)
    * Space complexity is O(N)
    *
    **/
    public static void main(String[] args) {
        int[] input={3,8,1,-9,-8};
        System.out.println(findMaxForEachSubArray(input));
    }
    public static int findMaxForEachSubArray(int[] input){
        int max=0;
        int N=input.length;
        for(int i=0;i<N;i++){                                      //
            int sum=0;                                             //
            for(int j=i;j<N;j++){                                  //
                sum= sum+input[j];                                 // Time complexity O(N^2)
                max= Math.max(sum,max);                            //
            }                                                      //
        }                                                          //
        return max;
    }
}
