package git.Easy.PrefixString;

public class prefixSumLeastAverage {

    /**
     * Time complexity is O(N+(N-B))=> O(N)
     * Space complexity is O(N) for creating prefix sum
     *
     * We need to return the starting index of the subarray which has least sum/ least average
     * Formula
     * =======
     * Prefix sum finding => prefixSum[i] = prefixSum[i - 1] + A[i];
     *
     * Sum finding for range => SUM[L,R] = prefixSum[R]-prefixSum[L-1] where L>0
     */

    public static void main(String[] args) {
        int[] array = {18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 19, 19};
        System.out.println(solve(array, 1));
    }

    public static int solve(int[] A, int B) {
        //least average is min average
        //min average means min sum
        int leastIndex = 0;
        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {                                     //
            prefixSum[i] = prefixSum[i - 1] + A[i];                              //  O(N) Time complexity
        }                                                                        //

        int min = Integer.MAX_VALUE;                                             //
        int left = 0;                                                            //
        int right = B-1;                                                         //
        while (right < A.length) {                                               //
            int val;                                                             //
            if (left == 0) {                                                     //
                val = prefixSum[right];                                          //
            } else {                                                             //
                val = prefixSum[right] - prefixSum[left - 1];                    //   O(N-B)   Time complexity
            }                                                                    //
            if (min > val) {                                                     //
                min = val;                                                       //
                leastIndex = left;                                               //
            }                                                                    //
            left++;                                                              //
            right++;                                                             //
                                                                                 //
        }                                                                        //

        return leastIndex;
    }
}
