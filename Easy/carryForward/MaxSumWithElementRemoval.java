package git.Easy.carryForward;

/*
* You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
Find and return the maximum possible sum of the B elements that were removed after the B operations.
*
* APPROACH
* ========
* Find the prefixSum Array using the formula prefixSum[i] = prefixSum[i-1]+A[i]
* Find the sufixSum Array using the formula suffixSum[i] = suffixSum[i+1]+A[i]
* After this iterate upto the given numberofElementsToBeRemoved(B) and find the maxSum of all the B elements with multiple combinations.
*
* Eg: [5,-2,3,1,2]
*      find the maxSum for edge case (0,B) and (B,0) then find the maxSum for following
*       (1,B-1), (2,B-2), (3, B-3) upto ..(N,B-(N-1)) etc.,
*       (B-1,1), (B-2,2), (B-3,3) upto ..(B-(N-1),N) etc.,
*
*  Space complexity is O(N)
*  Time complexity is O(N)
* */
public class MaxSumWithElementRemoval {
    public static void main(String[] args) {
        int[] array = {5, -2, 3, 1, 2};
        System.out.println(maxSum(array,3));
    }

    public static int maxSum(int[] array,int noOfElementsToBeRemoved) {
        int maxSum;
        int N = array.length;
        int[] prefixSum = new int[N];
        int[] sufixSum = new int[N];
        prefixSum[0] = array[0];                                                                    //                  //
        for (int i = 1; i < N; i++) {                                                               // O(N)             //
            prefixSum[i] = prefixSum[i - 1] + array[i];                                             //                  //
        }                                                                                                               //
        sufixSum[N-1]=array[N-1];                                                                                       //
        for(int i=N-2;i>=0;i--){                                                                     //                 //      Time complexity
            sufixSum[i]=sufixSum[i+1]+array[i];                                                      // O(N)            //     O(N+N+N) = O(N)
        }                                                                                            //                 //
        maxSum = Math.max(prefixSum[noOfElementsToBeRemoved-1],sufixSum[N-noOfElementsToBeRemoved]);                    //
        for(int i=1;i<noOfElementsToBeRemoved;i++){                                                        //           //
            int sum = prefixSum[i-1]+sufixSum[N-(noOfElementsToBeRemoved-i)];                              //           //
            maxSum= Math.max(maxSum,sum);                                                                  // O(N)      //
        }                                                                                                  //           //

        return maxSum;

    }

}
