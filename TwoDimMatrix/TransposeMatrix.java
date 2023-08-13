package git.TwoDimMatrix;

public class TransposeMatrix {
    /*
    * Time complexity is O(M*N) if M is number of rows and N is number of column
    * Space complexity is O(1) as we are swapping it in-memory
    *
    * Eg:[1,2,3]
    *    [4,5,6]
    *    [7,8,9]
    *  After taking transpose rows become columns and columns become rows
    *  we need to only swap elements below the diagonal elements to avoid un-necessary operations
    *    [(1), 4,  7 ]
    *    [ 2, (5), 8 ]
    *    [ 3,  6, (9)]
    *
    *
    * */
    public static void main(String[] args) {
        int[][] input={{1,2,3},{4,5,6},{7,8,9}};
        int rows=input.length;
        int col=input[0].length;
        for(int i=1;i<rows;i++){                                             //
            for(int j=0;j<i;j++){                                            //
                int temp= input[i][j];        //                             //
                input[i][j]= input[j][i];     // Swap [i][j] to [j][i]       //       Time complexity O(N^2) as row and column are N
                input[j][i]=temp;             // for i<j elements            //
            }                                                                //
        }                                                                    //
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(input[i][j]);
            }
            System.out.println("");
        }

    }
}
