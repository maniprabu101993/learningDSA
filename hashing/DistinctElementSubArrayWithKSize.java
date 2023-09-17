package git.hashing;

import java.util.HashMap;
//Count distinct elements in every window of size k
public class DistinctElementSubArrayWithKSize {
    public static void main(String[] args) {
        int[] input={2,4,3,8,3,9,4,9,4,10};//size=10 ,k=4 ,resultArraySize=7
        int k=4;
        int[] output=calculateDistinctNumber(input,k);
        for(int val:output){
            System.out.println(val);
        }

    }

    /***
     * Time complexity O(N)
     * Space complexity O(K) can be of O(N)
     */

    public static int[] calculateDistinctNumber(int[] input,int k){
        int[] ans=new int[input.length-k+1];
        HashMap<Integer,Integer> countMap=new HashMap<>();
        for(int i=0;i<k;i++){
            countMap.put(input[i],countMap.getOrDefault(input[i],0)+1);
        }
        ans[0]=countMap.size();
        int leftPointer=1;
        int rightPointer=k;
        int i=1;
        while(rightPointer<input.length){
            countMap.put(input[leftPointer-1],countMap.get(input[leftPointer-1])-1);
            countMap.put(input[rightPointer],countMap.getOrDefault(input[rightPointer],0)+1);
            if(countMap.get(input[leftPointer-1])==0){
                countMap.remove(input[leftPointer-1]);
            }
            ans[i++]=countMap.size();
            leftPointer++;
            rightPointer++;
        }
        return ans;
    }
}
