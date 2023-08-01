package git.Easy.PrefixSum.prefixString;

import java.util.Arrays;

public class CommonPrefixString {
    public static void main(String[] args) {
        String[] input ={"abcd","abc","abbbbhn","a1b","ab"};
        Arrays.sort(input);//sorting the string inorder to make the least common string at last of the array
        if(input.length==0){
            System.out.println("");
            return;
        }
        if(input.length==1){
            System.out.println(input);
            return;
        }
        String first= input[0];
        String second= input[input.length-1];
        int length = Math.min(first.length(), second.length());
        StringBuilder output=new StringBuilder();
        for(int i=0;i<length;i++){
            if(first.charAt(i)==second.charAt(i)){
                output.append(first.charAt(i));
            }else{
                break;
            }
        }
        System.out.println(output);

    }
}
