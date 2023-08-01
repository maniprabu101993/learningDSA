package git.Easy.PrefixSum;

import java.util.Arrays;

/**
 * Problem is to count the number of even elements between the given range of index
 * Prefix sum formula
 * ==================
 * prefixSum[i] = prefixSum[i-1]+ A[i]
 *
 * Range sum formula
 * ==================
 * sum(L,R) = prefixSum[R] - prefixSum[L-1]
 *
 * TimeComplexity for this problem is O(N*Q) where Q is the queries range size
 * SpaceComplexity for this problem is O(N) which is the prefixSum Array.
 * ,
 * [8,6,5,4,3,56,2,1] Mark all the even numbers as 1 as given below so that we can calculate the number of even numbers in the range
 *          ||
 *          ||
 *          \/
 * [1,1,0,1,0,1,1,0]
 * */
public class NumberOfEvenNumbersInRange {
    public static void main(String[] args) {
        int[] input = {8, 6, 5, 4, 3, 56, 2, 1};
        int[][] queries = {{2, 4}, {0, 4}, {1, 3}, {4, 5}};
        Arrays.stream(countEvenInRange(input, queries)).forEach(value -> System.out.println(value));
    }

    public static int[] countEvenInRange(int[] input, int[][] queries) {
        int[] output = new int[queries.length];
        int[] prefixSum = new int[input.length];

        prefixSum[0] = input[0] % 2 == 0 ? 1 : 0;
        for (int i = 1; i < input.length; i++) {                                                   //                   //
            prefixSum[i] = prefixSum[i - 1] + (input[i] % 2 == 0 ? 1 : 0);                         //  O(N)             //
        }                                                                                          //                   //
                                                                                                                        //
        for(int j=0;j<queries.length;j++){                                                         //                   //      Time Complexity: O(N*Q)
            int start= queries[j][0];                                                              //                   //
            int end= queries[j][1];                                                                //   O(Q)            //
            output[j] = prefixSum[end]- (start ==0 ? 0:prefixSum[start-1]);                        //                   //
        }                                                                                          //                   //

        return output;
    }
}
