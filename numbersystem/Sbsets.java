package git.numbersystem;

import java.util.ArrayList;
import java.util.List;

public class Sbsets {
    //Print subsets of a given array
    public static void main(String[] args) {
        int[] input = {8, 16, 22};
        int N = input.length;
        List<List<Integer>> outputList = new ArrayList<>();
        for (int i = 0; i < ((1 << N)); i++) { // For N=3, 2 power 3 is 8 then 000,001,010,011,100,101,110,111
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) > 0) {
                    list.add(input[j]);
                }
            }
            outputList.add(list);
        }
        for(List<Integer> val:outputList){
            for(Integer lll:val){
                System.out.print(lll+" ");
            }
            System.out.println();
        }
    }
}
