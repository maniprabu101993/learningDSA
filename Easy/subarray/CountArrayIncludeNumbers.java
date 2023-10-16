package git.Easy.subarray;

import java.util.HashMap;
import java.util.Map;

public class CountArrayIncludeNumbers {
    //count number of subarrays which has atleast one 0,1,2
    public static void main(String[] args) {
        //Window size 3 4
        //Window size 4 3
        //Window size 5 2
        //Window size 6 1
        int[] arr = {0, 1, 2, 0, 1, 2}; //ans = 10
        int diff = 3;
        int ans=1; // include the full array as subarray
        for (int i = diff; i < arr.length; i++) {
            int left = 0;
            int right = i-1; // start with window size 3
            Map<Integer, Integer> occurrence = new HashMap<>();
            for(int count=0;count<i;count++){
                occurrence.put(arr[count],occurrence.getOrDefault(arr[count],0)+1);
            }
            while (right < arr.length) {
                if(occurrence.get(0)>=1&&occurrence.get(1)>=1&&occurrence.get(2)>=1) {
                    ans++;
                }
                left++;
                right++;
                if(right<arr.length) {
                    if (occurrence.containsKey(arr[left - 1]) && occurrence.get(arr[left - 1]) >= 1) {
                        occurrence.put(arr[left - 1], occurrence.get(arr[left - 1]) - 1);
                    }
                    occurrence.put(arr[right], occurrence.getOrDefault(arr[right], 0) + 1);
                }
            }
        }

        System.out.println(ans);
    }
}
