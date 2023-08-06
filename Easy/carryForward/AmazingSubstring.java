package git.Easy.carryForward;

import java.util.ArrayList;
import java.util.List;

/*
*An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
* Time complexity if O(N^2)
* Space complexity is O(1)
* But we have a optimized approach with time complexity O(N) where we derive a formula inorder to find the total count of subarray that start with vowels
* count = count+ (N-i) because there will be (N-i) subarrays will be present for given ith index.
* Eg: ADFRETY
*      In the given string as the 1st char starts with vowels ,the number of subarrays count is (N-i)=>(7-0)=7
*  then the 4th index character starts with vowels, the number of subarrays count is (N-i)=>(7-4)=3
* in total (7+3) =10 subarrays that starts with vowels.
*
 *
**/
public class AmazingSubstring {
    public static void main(String[] args) {
        String s = "ADFRETY";
        System.out.println(solveOptimized(s));
    }
    public static int solve(String A) {
        char[] inputs={'a','e','i','o','u','A','E','I','O','U'};
        long counter=0;
        List<Character> list=new ArrayList<>();
        for(Character val:inputs){
            list.add(val);
        }
        for(int i=0;i<A.length();i++){                           //
            if(list.contains(A.charAt(i))){                      //
                for(int j=i;j<A.length();j++){                   //
                    counter = counter+1;                         //  Time complexity O(N^2)
                }                                                //
            }                                                    //
        }                                                        //
        return (int)counter;
    }

    public static int solveOptimized(String A){
        long counter=0;
        for(int i=0;i<A.length();i++){                                                                                  //
            if(A.charAt(i)=='a' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u' || A.charAt(i)=='e'||       //
                    A.charAt(i)=='A' || A.charAt(i)=='E' || A.charAt(i)=='I' || A.charAt(i)=='O' || A.charAt(i)=='U'){  // Time complexity O(N)
                counter = counter+(A.length()-i);                                                                       //
            }                                                                                                           //
        }                                                                                                               //
        return (int)counter;
    }

}

