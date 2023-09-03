package git.sorting;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticProgressionfinding {
    public static void main(String[] args) {
        int[] A={8,2,6,4};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        //find 2 min numbers by iterating all numbers in arrays
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]<min1){
                min2=min1;
                min1=A[i];
            }else if(A[i]<min2 && A[i]!=min1){
                min2=A[i];
            }
        }
        long diff=(long)min2-min1;

        List<Long> list=new ArrayList<>();
        for(int val:A){
            list.add((long) val);
        }
        for(int i=1;i<A.length;i++){
            long num=min1+(i*diff); // use the formula min1*(i*diff) as all the AP will have consecutive numbers with same differences
            if(!list.contains(num)){
                return 0;
            }
        }
        return 1;
    }
}
