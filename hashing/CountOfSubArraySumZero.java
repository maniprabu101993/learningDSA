package git.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubArraySumZero {

    public static void main(String[] args) {
        int[] input={1,4,-4,4,-4,8,-4,-4};
        Map<Integer,Integer> map=new HashMap<>();
        int[] ps=new int[input.length];
        ps[0]=input[0];
        for(int i=1;i<input.length;i++){
            ps[i]=ps[i-1]+input[i];
        }
        int count=0;
        for(int i=0;i<ps.length;i++){
            if(map.containsKey(ps[i])){
                count=count+map.get(ps[i]);
                map.put(ps[i],map.get(ps[i])+1);
            }else{
                map.put(ps[i],1);
            }
        }
        System.out.println(count);


    }
}

