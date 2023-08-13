package git.TwoDimMatrix;

public class AntiDiagonalElements {
    /**
     * Antidiagonal elements are having starting point of (0,N-1) and ending point of (M-1,0)
     * <p>
     * Eg:[1,2,(3)]
     *    [4,(5),6]
     *    [(7),8,9]
     * <p>
     * Output will be 3, 5, 7
     **/
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 22}, {4, 5, 6,44}, {7, 8, 9,55}};
        int rows = input.length;
        int col = input[0].length;
        int i = 0;
        int j = col - 1;
        while (i < rows) {                            //
            System.out.println(input[i][j]);          //
            i++;                                      // Time complexity is O(N)
            j--;                                      //
        }                                             //
        OptimizedFormula(input);
    }

    public static void OptimizedFormula(int[][] input){
        for(int i=0;i<input.length;i++){                //
            int j=input[i].length-1-i;                  //  Optimized formula for finding the antidiagonal elements
            System.out.println(input[i][j]);            //   j=N-1-i; Time complexity is O(N)
        }                                               //
    }
}
