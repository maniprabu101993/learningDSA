package git.numbersystem;

import java.util.ArrayList;
import java.util.List;

public class DivideWithoutDivision {
    public static void main(String[] args) {
        int dividend=-2147483648;
        int divisor=2;
        List<Character> list=new ArrayList<>();
        list.set(0,(char)((int)list.get(0)+('a'-'A')));
        System.out.println(divideBitWise(dividend,divisor));
//        System.out.println(Integer.MAX_VALUE);
    }
    public static int divide(int dividend, int divisor) {
        int counter=0;
        boolean isDivisorNegative=false;
        boolean isDividentNegative=false;
        if(divisor==1){
            return dividend;
        }
        if(divisor== -1){
            if(dividend>Integer.MAX_VALUE){
                dividend=Integer.MAX_VALUE;
            }
            if(dividend<=Integer.MIN_VALUE){
                dividend=Integer.MIN_VALUE+1;
            }
            int value = -dividend;
            if(value>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(value<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            return value;
        }
        if(divisor<0){
            isDivisorNegative=true;
            divisor= -divisor;
        }
        if(dividend<0){
            isDividentNegative=true;
            dividend= -dividend;
        }
        while(dividend>=divisor){
            counter++;
            dividend=dividend-divisor;
        }
        if(isDivisorNegative){
            counter = -counter;
        }
        if(isDividentNegative){
            counter = -counter;
        }
        return counter;
    }


    public static int divideBitWise(int dividend, int divisor) {
        long divid=dividend;
        long divs=divisor;
        int resultSign=(dividend>0) ^ (divisor>0) ? 1:0;
        long temp=0;
        long quotient=0;
        long dividendl=Math.abs(divid);
        long divisorl=Math.abs(divs);
        for(int i=31;i>=0;i--){
            if(temp+(divisorl<<i)<=dividendl){
                temp = temp + (divisorl<<i);
                quotient= (quotient|(1L<<i));
            }
        }
        if(resultSign==1){
            quotient = -quotient;
        }
        if(quotient>=Integer.MAX_VALUE || quotient<Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)quotient;
    }
}
