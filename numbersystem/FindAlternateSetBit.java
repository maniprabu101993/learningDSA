package git.numbersystem;

public class FindAlternateSetBit {
    /*
    * We need to first find the binary form of numbers that have the highest bit as 1 because binary format of a number will have 31 bits which has
    * Zero as the starting bit .After finding the starting point the number which has 1 bit we can store that in string and iterate through the string
    * length inorder to find whether the previous and the current char are same , if its same then we can say there are bits with continuous 1's or continuous 0's
    *
    * */
    public static void main(String[] args)
    {
        int n = 21; // equal to 10101
        StringBuilder binaryNumber=new StringBuilder();
        while(n>0){
            binaryNumber.append(n&1);
            n=n>>1;
        }
        char prev;
        prev = binaryNumber.charAt(0);
        for(int i=1;i<binaryNumber.length();i++){
            char current=binaryNumber.charAt(i);
            if(current==prev){
                System.out.println("NOt having alternate bit set");
                return;
            }
            prev=current;
        }
        System.out.println("Having alternate bit set");
    }
}
