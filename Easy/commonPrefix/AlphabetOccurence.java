package git.Easy.commonPrefix;

public class AlphabetOccurence {
    public static void main(String[] args) {
        char[] array= {'a','b','c','d','a','c'};
        char toFind = 'b';
        int[] range={4,4};
        int counter=0;
        for(int i=range[0];i<=range[1];i++){
            if(toFind==array[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
