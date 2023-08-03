package git.Easy.carryForward;

/**
 * The problem is to find the maximum profit that can be gained by buying and selling the stocks on a given day
 * Brute force approach will be two take two for loops for i and j=i+1 and calculate the difference A[i+1]-A[i] and find the max difference.
 * for(int i=0;i<N;i++){
 *     for(int j=i+1;j<N;j++){
 *         max(A[j]-A[i],max);
 *     }
 * }
 * Optimized Approach for this problem is starting from right most end calculate the maximum and find the difference to the current element with the max
 * (max-current number).
 * Time complexity for this problem is O(N)
 * Space complexity is O(1)
 * index--> 0,1,2,3,4,5,6
 * Eg:     [4,5,8,9,2,1,7] start from 6th index and keep the maximum as current value as there is no previous value.
 *          i=6 => max=A[6]=7 , diff= 7-7=0 , maxDiff=0
 *          i=5 => max=still 7 ,diff=7-1=6 ,  maxDiff=6
 *          i=4 => max=still 7, diff=7-2=5 ,  maxDiff=6
 *          i=3 => max=A[3]=9 , diff=9-9=0 ,  maxDiff=6
 *          i=2 => max=still 9, diff=9-8=1 ,  maxDiff=6
 *          i=1 => max=still 9, diff=9-5=4,   maxDiff=6
 *          i=0 => max=still 9, diff=9-4=5,   maxDiff=6
 *          So the answer would be 6
 *
 * */
public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] input={4,5,8,9,2,1,7};
        System.out.println(countMaxProfit(input));
    }
    public static int countMaxProfit(int[] array){
        int maxProfit=0;
        int N= array.length;
        int max=0;
        for(int i= N-1;i>=0;i--){                   //
            if(max<array[i]){                       //
                max= array[i];                      //
            }                                       // Time complexity is O(N)
            int diff= max-array[i];                 //
            if(diff>maxProfit){                     //
                maxProfit=diff;                     //
            }                                       //
        }
        return maxProfit;
    }
}
