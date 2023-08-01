package git.Easy.PrefixSum;

/**
 *  Question : Find the number of equilibrium Index in the given array
 *  An index is said be equilibrium if the sum of elements left to that number and right to that number is same
 * [0 -> i-1] [i] [i+1 -> N-1]
 *
 *  Formula for prefixSum
 * ==========================
 *  <code>
 *      { if i!=0 then prefixSum[i] = prefixSum[i-1]+ A[i]
 *          else if i==0 then
 *          prefixSum[i]=prefixSum[i-1]
 *  }
 *  </code>
 *
 *  Formula for sum in the given range Sum(L,R)
 *  =============================
 *  <code>
 *      Sum(L,R) = prefixSum(R) - prefixSum(L-1)
 *  </code>
 *  Here the time complexity for the problem is O(N)
 *  Space complexity for using prefixSum is O(N)
 */
public class EquilibriumIndexUsingPrefixSum {
    public static void main(String[] args) {
        int[] input = {1, 5, 8, -3, -2, 11};

        System.out.println(countEquilibrium(input));
    }

    public static int countEquilibrium(int[] input) {
        int counter = 0;
        int[] prefixSum = new int[input.length];
        prefixSum[0] = input[0];
        for (int i = 1; i < input.length; i++) {                                               //           //
            prefixSum[i] = prefixSum[i - 1] + input[i];                                        //  O(N)     //
        }                                                                                      //           //
                                                                                                            //
        //Now prefix sum is calculated we need to find the left sum and right sum for each index            //
        int leftSum = 0;                                                                                    //
        int rightSum = 0;                                                                                   //
        //formula sum(L,R) = prefixSum[R]-prefixSum[L-1]                                                    // Time complexity O(2N)==>O(N)
        for (int i = 0; i < input.length; i++) {                                                //          //
            if(i!=0){                                                                           //          //
                leftSum= prefixSum[i-1]; // (L)0 -> (R)i-1                                      //          //
            }                                                                                   // O(N)     //
            rightSum= prefixSum[input.length-1] - prefixSum[i+1-1] ; // (L)i+1 -> (R)N-1        //          //
            if(leftSum == rightSum){                                                            //          //
                counter++;                                                                      //          //
            }                                                                                   //          //
        }
        return counter;
    }
}
