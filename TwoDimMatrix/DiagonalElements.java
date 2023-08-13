package git.TwoDimMatrix;

public class DiagonalElements {
    /*
    * Time complexity will be O(N)
    * SPace complexity is O(1)
    *  Eg:[1,2,3]
     *    [4,5,6]
     *    [7,8,9]
     *
     * Output will be 1, 5, 9
    */
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = input.length;
        int col = input[0].length;
        for(int i=0;i<rows;i++){
            System.out.println(input[i][i]); // only iterate rows and print the ith row and ith column instead of jth column we are using only ith column as
                                            //  diagonal elements will have same row and same column
        }
    }
}
