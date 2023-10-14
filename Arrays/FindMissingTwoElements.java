package git.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMissingTwoElements {
    public static void main(String[] args) {
        int[] input={};
        int N=input.length;
        boolean[] mark=new boolean[N+3];
        for(int i=0;i<N;i++){
            mark[input[i]]=true;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<N+2;i++){
            if(!mark[i]){
                list.add(i);
            }
        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> output=new ArrayList();
        int N=A.size();
        int xor=0;
        for(int i=0;i<N;i++){
            xor=(xor^A.get(i));
        }
        for(int i=1;i<=N+2;i++){
            xor=(xor^i);
        }
        int setBit=0;
        for(int i=0;i<31;i++){
            if(((1<<i)&xor)>0){
                setBit=i;
                break;
            }
        }
        int ans=0;
        int ans2=0;
        for(int i=0;i<N;i++){
            if((A.get(i)&(1<<setBit))>0){
                ans =ans^A.get(i);
            }else{
                ans2=ans2^A.get(i);
            }
        }
        for(int i=1;i<=N+2;i++){
            if((i&(1<<setBit))>0){
                ans =ans^i;
            }else{
                ans2=ans2^i;
            }
        }
        output.add(ans>ans2?ans2:ans);
        output.add(ans<ans2?ans2:ans);
        return output;
    }
}
