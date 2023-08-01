package git.Easy.PrefixSum;

/**
 *  Question : Find the number of equilibrium Index in the given array
 *  An index is said be equilibrium if the sum of elements left to that number and right to that number is same
 *  [0 -> i-1] [i] [i+1 -> N-1]
 *  Time complexity for this code is O(N*N)
 *  Space complexity for this code is O(1)
 * */
public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] input = {1, 5, 8, -3, -2, 11};

        System.out.println(countEquilibrium(input));
    }

    public static int countEquilibrium(int[] input) {
        int counter = 0;

        for (int i = 0; i < input.length; i++) {
            int sumLeft = 0;                                                //
            int sumRight = 0;                                               //
            if (i != 0) {                                                   //
                for (int j = 0; j < i; j++) {              //               //
                    sumLeft += input[j];                   // O(N)          //
                }                                          //               //
            }                                                               //     Time complexity - O(N*2N)=> O(N*N)
            for (int j = i + 1; j < input.length; j++) {  //                //
                sumRight += input[j];                     //  O(N)          //
            }                                             //                //
            if (sumLeft == sumRight) {                                      //
                counter++;                                                  //
            }                                                               //
        }                                                                   //

        return counter;
    }

}
