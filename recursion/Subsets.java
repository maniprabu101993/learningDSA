package git.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
    int[] input={8,9,12,16};
    List<Integer> list=new ArrayList<>();
    printRecursive(input,0,list);
    }
    public static void printRecursive(int[] input,int index,List<Integer> output){
        if(index==input.length){
            output.forEach(val -> System.out.print(val+" "));
            return;
        }
        printRecursive(input,index+1,output);    // not picking up the index
        output.add(input[index]);                                   //
        System.out.println();                                       //    Picking up the index
        printRecursive(input,index+1,output);                 //
        output.remove((Integer)input[index]);                       //
    }
}
