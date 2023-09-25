package git.Arrays;
// Leetcode 977
// Input already sorted in increasing order
public class SquareSorting {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};//16,1,0,9,100
        int[] output=new int[nums.length];
        int i=0; //0
        int j=nums.length-1; //4
        for(int k=nums.length-1;k>=0;k--){        // 4 , 3 , 2 , 1 , 0
            if(nums[i]*nums[i]>=nums[j]*nums[j]){ // 16>100 // 16>9 // 1>9 //1>0
                output[k]=nums[i]*nums[i];        // output[3]=16 | output[1]=1
                i++;                              // 1 | 2
            }else{
                output[k]=nums[j]*nums[j];       //output[4]=100 | output[2]=9 | output[0]=0
                j--;                             // 3 | 2 | 1
            }
        }
        for(int val:output){
            System.out.print(val+" ");
        }
    }
}
