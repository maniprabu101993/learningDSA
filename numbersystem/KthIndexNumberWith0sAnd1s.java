package git.numbersystem;
//Leetcode 779
public class KthIndexNumberWith0sAnd1s {
    public static void main(String[] args) {
        int A=30;
        int B=300;
        System.out.println(solveWithParent(A,B));
        System.out.println(solveWithMidPosition(A,B));
    }
    /**
     *  Finding using parent number and the Bth position is even or odd
     *  1. Parent can be found by going to previous index (A-1) and reducing the length of the numbers by half as the length will be normally increase by 2 pow 1
     *  2. Position if the Bth index can be odd or even. Based on that we can find whether the number is 0 or 1.
     * **/
    public static int solveWithParent(int A,int B){
        if(A==0){
            return 0;
        }
        int parent = solveWithParent(A-1,B/2);
        if(parent==1){           //parent           |--0--|       |--1--|  Because 0 will be replaced by 01 and 1 will be replaced by 10
            return B%2==0? 0:1;  //                 0     1       1     0
        }else{                   //                odd  even     odd   even
            return B%2==0? 1:0;
        }
    }

    /**
     * 0         | length=Math.pow(2,0) => 1
     * 01        | length=Math.pow(2,1) => 2
     * 0110      | length=Math.pow(2,2) => 4
     * 01101001  | length=Math.pow(2,3) => 8
     *
     *      Find mid element by dividing length of the numbers by 2 ie.., Math.pow(2,x)/2
     *      If mid element is greater than or equal to the given b then reduce a by 1 and call the same method.
     *      if mid element is less than or equal to the given b then reduce a by 1 and b as (b-mid)
     * **/
    public static int solveWithMidPosition(int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        int mid= (int)(Math.pow(2,a-1))/2;
        if(b<=mid){
            return solveWithMidPosition(a-1,b);
        }
        return 1 - solveWithMidPosition(a-1,b-mid);// complement of 0 or 1
    }
}
