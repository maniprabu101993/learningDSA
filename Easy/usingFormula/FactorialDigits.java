package git.Easy.usingFormula;

/*
* Inorder to find the digits in the result of a factorial number we can use the log base 10 operator which provides the correct length of the number.
*  loop through the numbers starting from 2 to the given number and find Math.log base 10(i)
*
* Time complexity for this solution is O(N)
* Space complexity for this solution is O(1)
* */
public class FactorialDigits {
    public static void main(String[] args) {
        System.out.println(findDigitsOfFactorial(5)); // 1 2 3 4 5 6
    }

    public static int findDigitsOfFactorial(int n) {
        if (n <= 0) {
            return 1; // Factorial of non-positive numbers is 1, so it has one digit.
        }
        double count=0;
        for(int i=2;i<=n;i++){                                                     //
            count=count+Math.log10(i);                                             // Time complexity O(N)
            System.out.println("i "+i+" count "+ count);                           //
        }                                                                          //
        return (int) (count)+1;
    }
}
