package git.sorting;

import java.util.*;

public class SortBasedOnFactors {
    public static void main(String[] args) {
        int[] A={36, 13, 13 ,26 ,37, 28, 27, 43, 7};
        Integer[] newValues=new Integer[A.length];
        for(int i=0;i<A.length;i++){
            newValues[i]=A[i];
        }
        Arrays.sort(newValues,new customComparator1());
        for(int i=0;i<A.length;i++){
            A[i]=newValues[i];
            System.out.println(A[i]);
        }

    }

    private static class customComparator1 implements Comparator<Integer>{
        @Override
        public int compare(Integer first,Integer second){
            int factors1=countOfFactors(first);
            int factors2=countOfFactors(second);
            System.out.println(" number "+ first +" fact "+factors1);
            System.out.println(" number2 "+ second +" fact2 "+factors2);
            if(factors1>factors2 || ((factors1==factors2)&&(first<second))){
                return 1;
            }else if(factors1<factors2){
                return -1;
            }
            return 0;
        }
    }

    private static int countOfFactors(Integer n){
        int counter=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i*i==n){
                    counter+=1;
                }else {
                    counter+=2;
                }
            }
        }
        return counter;
    }
}
