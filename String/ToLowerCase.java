package git.String;

import java.util.ArrayList;

public class ToLowerCase {
    public static void main(String[] args) {
        ArrayList<Character> A=new ArrayList<>();
        String s="ToLowERCasE";
        for(char val:s.toCharArray()){
            A.add(val);
        }
        for(int i=0;i<A.size();i++){
            if(A.get(i)>='A' && A.get(i)<='Z') {
                A.set(i, (char) ((int) A.get(i) + ('a' - 'A')));
            }
        }
        A.forEach(System.out::print);
    }
}
