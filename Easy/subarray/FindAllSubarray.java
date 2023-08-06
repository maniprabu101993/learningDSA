package git.Easy.subarray;

public class FindAllSubarray {
    /**
     * Find all the possible subarrays in the given array and return it in 2D array.
     * we can use a concept of CPC,CPR compressed parsed column/row to only store the non zero values in the matrix.
     * If we normally create a 2D array then all the non empty values will be zero but that should not be the case here.
     * thats why we are using CPC to store only the non zero values in the 2D array.
     *
     * This code involves iterating 2 for loops for finding the range of subArrays
     * Eg:Range for an array of length 5 is (0,0),(0,1),(0,2),(0,3),(0,4),(1,1),(1,2),(1,3),(1,4),(2,2),(2,3),(2,4),(3,3),(3,4),(4,4)
     * Then again loop through the start and end index in the range using another for loop to find the elements of subArray.
     * So totally we ran 3 nested for loops which has time complexity of O(N^3);
     * Space complexity is O(N) as we are creating a new array for storing subarray in each row.(maximum we will create a array of N length)
     *
     * **/
    public static void main(String[] args) {
        int[] input = {5, 9, 6, 1, 2};
        int[][] output = findAllSubArray(input);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j]);
            }
        }
    }

    public static int[][] findAllSubArray(int[] input) {
        int N = input.length;
        int subArrayLength = (N * (N + 1)) / 2;
        int[][] output = new int[subArrayLength][];//compressed parse column technique
        int counter = 0;
        for (int i = 0; i < N; i++) {                                  //
            for (int j = i; j < N; j++) {                              //
                int[] subArray = new int[j - i + 1];                   //
                for (int k = i; k <= j; k++) {                         //
                    subArray[k - i] = input[k];                        // Time complexity O(N*N*N)
                }                                                      //
                output[counter++] = subArray;                          //
            }                                                          //
        }                                                              //
        return output;
    }
}
