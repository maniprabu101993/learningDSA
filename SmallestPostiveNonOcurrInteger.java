package git;

import java.util.Arrays;

public class SmallestPostiveNonOcurrInteger {
    /*
     * Total time complexity for this solution is O (N (log N))
     * */
    public static void main(String[] args) {
        int[] array = {2, -5, 6, 3, 1, 8, 4, 9};
        Arrays.sort(array); // time complexity O(log n)
        int smallest = 1;
        for (int i = 0; i < array.length; i++) {  //
            if (array[i] == smallest) {           //
                smallest++;                       // time complexity O(n)
            }                                     //
        }                                         //
        System.out.println(smallest);
    }

}
