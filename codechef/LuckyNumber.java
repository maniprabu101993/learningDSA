package git.codechef;

import java.util.Scanner;

public class LuckyNumber {
    /**
     * A positive integer X is called lucky if it has an even power of 2 in its prime factorization.
     * More formally, let p be the largest integer such that X is divisible by 2
     * Then X is a lucky number if and only if p is divisible by 2.
     * You are given a positive integer N. Find if it is a lucky number.
     **/
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        for (int i = 0; i < numberOfInputs; i++) {
            long val = sc.nextLong();
            int counter = 0;
            while (val % 2 == 0) {
                val = val / 2;
                counter++;
            }
            if (counter % 2 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
