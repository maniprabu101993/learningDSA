package git;

import java.util.ArrayList;
import java.util.List;

public class CountStepsNeededToMakeArrayContinous {
    /*
    * Time complexity is O(N^2)
    * We can optimize this with some other approach
    * */
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{8,5,9,9,8,4}));
    }

    public static int minOperations(int[] nums) {
        List<Integer> list = new ArrayList();;
        for(Integer n:nums){
            list.add(n);
        }
        int mimimumsteps=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            int minimum= nums[j];
            int counter=0;
            for(int i=minimum;i<minimum+nums.length;i++){
                if(!list.contains(i)){
                    counter= counter+1;
                }
            }
            if(mimimumsteps>counter){
                mimimumsteps = counter;
            }
        }

        return mimimumsteps;
    }
}
