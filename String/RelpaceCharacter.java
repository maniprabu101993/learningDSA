package git.String;
//Leetcode 2839
public class RelpaceCharacter {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";
        System.out.println(canBeEqual(s1,s2));
    }
    public static boolean canBeEqual(String s1, String s2) {
        for(int i=0;i<4;i++){
            if(s1.charAt(i) != s2.charAt(i) && s1.charAt(i) != s2.charAt((i+2)%4)){
                return false;
            }
        }
        return true;
    }
}

