package git.Easy.PrefixSum;

public class NumberofAXGpairs {
    /*
    * Find the number of AXG pairs in given array.
    * Using prefixSum find the PS of A
    * then find the PS of G from right side as "AXG" has G at right side of X
    * Then when iterate tha array and find the X, multiply the number of A at that position(i) with number of G at that same position i
    *  PSum[A]*PSum[G] so that Count of AXG pairs can be found
    *
    * */
    public static void main(String[] args) {
        char[] array = {'a', 'a', 'x', 'g', 'a', 'x'};
        int[] prefixSumOfA = new int[array.length];
        int[] prefixSumOfG = new int[array.length];
        int counterOfG = 0;
        for (int i = array.length-1; i >=0; i--) {
            if (array[i] == 'g') {
                counterOfG++;
                prefixSumOfG[i] = counterOfG;
            } else {
                prefixSumOfG[i] = counterOfG;
            }
        }
        int counterOFA = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                counterOFA++;
                prefixSumOfA[i] = counterOFA;
            } else {
                prefixSumOfA[i] = counterOFA;
            }
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'x') {
                counter = counter+ (prefixSumOfA[i] *prefixSumOfG[i]);
            }
        }
        System.out.println(counter);
    }
}
