package git.numbersystem;

public class RightShift {
    /*
    * Find min val possible by combining the given integer in arrays
    *
    * */
    public static void main(String[] args) {
        long va=1;
        System.out.println(solve(21,56,87));
    }
    public static int solve(int A, int B, int C) {

        int min=Integer.MAX_VALUE;
        for(int j=0;j<6;j++){
            int number=0;
            int power=1;
            for(int i=0;i<3;i++){
                int temp = ((i+j)%3)==0?A:((i+j)%3)==1?B:C;
                number=(temp*power)+number;
                power =power*100;
            }
            System.out.println("number"+number);
            min =Math.min(min,number);

        }
        return min;
    }
}
