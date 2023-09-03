package git.numbersystem;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] input={1,2,3,4,5};
        int[] questions={2,3};
        int[][] output=solve(input,questions);
        for(int i=0;i<output.length;i++){
            for(int j=0;j<output[0].length;j++){
                System.out.print(output[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] solve(int[] A, int[] B) {
        int[][] output=new int[B.length][A.length];
        for(int k=0;k<B.length;k++){
            int[] temparray=A.clone();
            for(int swap=0;swap<(B[k]%A.length);swap++){
                for(int i=0;i<temparray.length-1;i++){
                    int temp=temparray[i];
                    temparray[i]=temparray[i+1];
                    temparray[i+1]=temp;
                }
            }
            output[k]=temparray;
        }


        return output;
    }
}
