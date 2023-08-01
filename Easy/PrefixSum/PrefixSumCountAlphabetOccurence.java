package git.Easy.PrefixSum;
/**
* Find the occurrence of a char in the character array in the given range
* Here the time complexity for the prefix sum approach is O(N+Q)
* The space complexity for this approach is O(N) as we are creating an extra int[] for storing prefixSum
* Make the targetChar as 1 and all other char as 0 so that we can add the numbers to find the count in the given range
*  Formula
 * ======
 * if i!=0 then prefixSum[i] = prefixSum[i-1]+ A[i]
 * else if i==0 then
 *   prefixSum[i]=prefixSum[i-1]
 *
*  EG:{'a', 'b', 'c', 'a', 'b', 'd', 'e', 'a'} => Make the target char as 1 and all other as zero here 'a' is target char
 *   :{ 1,   0,   0,   1,   0,   0,   0,   1}
* */
public class PrefixSumCountAlphabetOccurence {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'a', 'b', 'd', 'e', 'a'};
        char targetChar = 'a';
        int[][] queries = {{0,7}, {2,5}, {0,3}}; // Starting indices of the queries (inclusive)

        int[] occurrences = getCharOccurrences(charArray, targetChar, queries);

        // Display the occurrence count for the target character for each query range [L, R].
        for (int q = 0; q < queries.length; q++) {
            System.out.println("Query [" + queries[q][0] + ", " + queries[q][1] + "]: " + occurrences[q]);
        }
    }

    public static int[] getCharOccurrences(char[] charArray, char targetChar, int[][] queries) {
        int n = charArray.length;
        int[] occurrences = new int[queries.length];

        // Create a prefix sum array to count the occurrence of the target character.
        int[] prefixSum = new int[n];
        for (int i = 0; i < n; i++) {                                                          //                  //
            prefixSum[i] = (charArray[i] == targetChar) ? 1 : 0;                               //  O(N)            //
            if (i > 0) {                                                                       //                  //
                prefixSum[i] += prefixSum[i - 1];                                              //                  //
            }                                                                                  //                  //       O(N+Q)
        }                                                                                      //                  //
                                                                                                                   //
        // Calculate the occurrence count for each query range [L, R].                                             //
        for (int q = 0; q < queries.length; q++) {                                             //                  //
            int start= queries[q][0];                                                          //                  //
            int end =queries[q][1];                                                            //   O(Q)           //
            int leftOccurrence = (start > 0) ? prefixSum[start - 1] : 0;                       //                  //
            occurrences[q] = prefixSum[end] - leftOccurrence;                                  //                  //
        }                                                                                      //                  //

        return occurrences;
    }
}
