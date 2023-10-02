package git.numbersystem;

public class NumberOf1sDigits {
    public static void main(String[] args) {
        int A = 150;
        int n = A;
        int remainder = 0;
        int fact = 1;
        int couunt = 0;
        while (n > 0) {
            int temp = fact;
            if (n % 10 == 0) {
                remainder = 0;
            } else if (n % 10 > 1) {
                remainder = temp;
            } else if (n % 10 == 1) {
                remainder = (A % temp) + 1;
            }
            fact = fact * 10;
            couunt = couunt + (((A / fact) * temp) + remainder);
            n = n / 10;
        }
//        System.out.println((A % 10 == 0) ? (Math.ceil(Math.log10(A)) + 1) : Math.ceil(Math.log10(A)));
        System.out.println(couunt);
    }
}
