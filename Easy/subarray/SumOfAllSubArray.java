package git.Easy.subarray;

public class SumOfAllSubArray {

    /*
    * Find the sum of all subarray from the given array.
    * Time complexity for this program is O(N^2)
    * Space complexity is O(1) , we are using output array but that should not be considered for space complexity as this is the one the program expects
    * as output.
    * eg: [5,4,8] find sum of all subarray ranges from (0,0),(0,1),(0,2),(1,1),(1,2),(2,2)
    * Here we are storing the previous sum in a variable so that we can add only the current element to the sum so that we can get the new sum.
    * This uses the technique called "CARRY FORWARD"
    * */

    public static void main(String[] args) {
        int[] input= {5,4,8,9,1};
        int[] output=findSum(input);
        for(int out:output){
            System.out.println(out);
        }
    }

    public static int[] findSum(int[] inputArray){
        int N= inputArray.length;
        int length= (N*(N+1))/2;
        int[] output=new int[length];
        int counter=0;
        for(int i=0;i<N;i++){                                   //
            int sum =0;                                         //
            for(int j=i;j<N;j++){                               //
                sum = sum+inputArray[j];                        //  Time complexity O(N*N)
                output[counter++]=sum;                          //
            }                                                   //
        }                                                       //
        return output;
    }
}

