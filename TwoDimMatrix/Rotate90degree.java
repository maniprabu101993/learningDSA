package git.TwoDimMatrix;

public class Rotate90degree {
    /*
    * For rotating a matrix by 90 we need to do 2 steps.
    * 1. Take transpose of the given matrix
    * 2. From the result reverse each row.
    *
    * Eg:[1,2,3]
    *    [4,5,6]
    *    [7,8,9]
    * After rotating to 90 degree the result will be,
    *   [7,4,1]
    *   [8,5,2]
    *   [9,6,3]
    **/
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = input.length;
        int col = input[0].length;
        for (int i = 1; i < rows; i++) {                                      //                                       //
            for (int j = 0; j < i; j++) {                                     //                                       //
                int temp = input[i][j];        //                             //                                       //
                input[i][j] = input[j][i];     // Swap [i][j] to [j][i]       //       Time complexity O(N^2)          //
                input[j][i] = temp;            // as first step               //       as row and column are N         //
            }                                                                 //                                       //
        }                                                                                                              //
        //after finding transpose, reverse each row using array reverse                                                //
        for (int[] val : input) {                                                //                                    //    Total time complexity O(N^2)
            int start = 0;                                                       //                                    //
            int end = rows - 1;                                                  //                                    //
            while (start < end) {                                                //                                    //
                int temp = val[start];                                           //   Time complexity O(N^2)           //
                val[start] = val[end];                                           //                                    //
                val[end] = temp;                                                 //                                    //
                start++;                                                         //                                    //
                end--;                                                           //                                    //
            }                                                                                                          //
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(input[i][j]);
            }
            System.out.println("");
        }
    }
}
