package git.numbersystem;

public class BaseNumberCalculation {
    public static void main(String[] args) {
        //Binary to Decimal
        int A=1010;
        int B=2;
        int result=0;
        int i=0;
        while(A>0){
            result = result+(A%10*(int)Math.pow(B,i++));
            A=A/10;
        }
        System.out.println(result);

        //Decimal to Binary
        int A1=4;
        int B2=2;
        String st= "";
        while(A1>0){
            st = (A1%B2)+st;
            A1=A1/B2;
        }
        System.out.println(Integer.valueOf(st));
    }
}
