package git.TwoDimMatrix;

public class MatrixDiagonalAllElements {
    /**
     * [1,2,3]
     * [4,5,6]
     * [7,8,9]
     *
     * Diagonally built matrix
     *========================
     * (0,0)
     * (0,1),(1,0)
     * (0,2),(1,1),(2,0)
     * (1,2),(2,1)
     * (2,2)
     *
     * Time complexity is O(N^2)
     * Space complexity is O(1)
     * */
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3,4}, {4, 5, 6,8}, {7, 8, 9,6}};
        int rows = input.length;
        int col = input[0].length;
        for(int k=0;k<col;k++){                    //  Only iterating column as i will be always zero in the starting
            int i=0;                               //   [1],[2],[3]
            int j= k;                              //   [4],[5], 6
            while(i<rows && j>=0){                 //   [7], 8 , 9
                System.out.print(input[i][j]);     // Print diagonal elements starting from (0,0)
                i++;                               // to (0,col-1) ie.. diagonal starting in first row
                j--;                               // like (0,0),(0,1),(0,2)..(0,col-1)
            }                                      //
            System.out.println("");
        }

        for(int k=1;k<rows;k++){                    //  only iterating rows as j will be always col-1  in the starting
            int i=k;                                //   For a NxM matrix this loop will print diagonal elements starting from (1,M-1)
            int j=col-1;                            //   to (N-1,M-1)  like (1,M-1),(2,M-1),...(N-1,M-1)
            while(i<rows && j>=0){                  //   Eg: 3x3 matrix
                System.out.print(input[i][j]);      //   This loop will print diagonal (1,2),(2,1) and (2,2)
                i++;                                //    1,  2,   3
                j--;                                //    4,  5,  [6]
            }                                       //    7, [8], [9]
            System.out.println("");                 //
        }                                           //

    }
}
