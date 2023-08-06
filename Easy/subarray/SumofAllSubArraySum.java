package git.Easy.subarray;

public class SumofAllSubArraySum {
    /*
     * This question of finding the sum of all the subArraySum can be done in two ways where the normal method takes O(N^2) and another
     * method takes O(N) time complexity using the formula (i+1)(N-i)A[i]
     * Space complexity for both approach is O(1)
     *
     * How the formula is derived
     * [0,i-1,i,i+1,....N-1] =. here totally N elements are there
     * |_______|             ==> [0,i] => left side of i
     *         |___________| ==> [i,N-1] => right side of i
     * Inorder to find the number of elements that are present to left side of i including i using the formula [R-L+1] => [i-0+1] => [i+1]
     * Inorder to find the number of elements that are present to right side of i including i using the formula [R-L+1] => [(N-1)-(i)+1] => [N-i]
     * Therefore the total number of elements that contain ith elements is product of left side and right side (i+1)(N-i).
     * Inorder to find the sum of all subarray sum that contain ith element is A[i]*(i+1)(N-1)
     *
     * Eg: [2,3,5]
     * With the formula A[i]*(i+1)(N-i)
     * when i=0; A[0]*(0+1)(3-0) => 2*1*3 =6;
     * when i=1; A[1]*(1+1)(3-1) => 3*2*2 =12;
     * when i=2; A[2]*(2+1)(3-2) => 5*3*1 =15;
     *                              Total =33
     *
     * Using N^2 loop approach:
     * [2,3,5]
     * subarrays => (2),(2,3),(2,3,5),(3),(3,5),(5)
     * sum of subarray => 2,5,10,3,8,5
     * Total sum       => 2+5+10+3+8+5
     *            Total = 33
     *
     *  */
    public static void main(String[] args) {
        int[] input = {9, 2, 1, 3, 1, 4, 5, 6};
        System.out.println(sumOfSumOfAllSubArray(input));
        System.out.println(sumOfSumOfAllSubArrayUsingContribution(input));
    }

    public static int sumOfSumOfAllSubArray(int[] input) {
        int TotalSum = 0;
        int N = input.length;
        for (int i = 0; i < N; i++) {                           //
            int sum = 0;                                        //
            for (int j = i; j < N; j++) {                       // Time complexity O(N^2)
                sum = sum + input[j];                           //
                TotalSum += sum;                                //
            }                                                   //
        }                                                       //
        return TotalSum;
    }

    public static int sumOfSumOfAllSubArrayUsingContribution(int[] input) {
        int TotalSum = 0;
        int N = input.length;
        for (int i = 0; i < N; i++) {                                            //
            TotalSum = TotalSum + (i + 1) * (N - i) * input[i];                  //     Time complexity O(N)
        }                                                                        //
        return TotalSum;
    }
}
