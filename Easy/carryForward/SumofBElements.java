package git.Easy.carryForward;

/*
* You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
* Find and return the maximum possible sum of the B elements that were removed after the B operations.
* Optimized approach for this run at O(N) time complexity
* Space complexity O(N) as we are using prefixSum and sufixSum array
* Formula is Max(max,prefixSum[B-i],sufixSum[N-(B-i)]);
* */
public class SumofBElements {
    public static void main(String[] args) {
        int[] A={1,7,8,9,5,2,5};
        int B=3;
        int maxSum;
        int N=A.length;
        int[] pSum=new int[A.length];
        int[] sSum=new int[A.length];

        pSum[0]=A[0];
        sSum[N-1]=A[N-1];

        for(int i=1;i<A.length;i++){        //                                //
            pSum[i]= pSum[i-1]+A[i];        // Space complexity O(N)          //
        }                                   //                                //
        for(int i=N-2;i>=0;i--){            //                                // Space complexity O(N)
            sSum[i]=sSum[i+1]+A[i];         //  Space complexity O(N)         //
        }                                   //                                //
        maxSum= Math.max(pSum[B-1],sSum[N-B]);
        for(int i=1;i<B;i++){                                                 //
            maxSum=Math.max(maxSum,pSum[i-1]+sSum[N-(B-i)]);                  // Time complexity O(N)
        }                                                                     //
        System.out.println(maxSum);
    }
}
