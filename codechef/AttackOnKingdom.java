package git.codechef;

/*
*Problem
* Nightking wants to attack the kingdom and he really likes cold days. However, he doesn’t want to attack the kingdom on the coldest day, because it is obvious.
* Instead, he will attack the second coldest day.
* Given an array A of N distinct integers where Ai represents the temperature forecast of the i-th day, You need to find the temperature of the day of the attack.
*
* Solution: we need to find the 2nd lowest element in the given array.
* */

import java.util.Arrays;
import java.util.Scanner;

public class AttackOnKingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        for (int i = 0; i < numberOfInputs; i++) {
            int lengthOfinput = sc.nextInt();
            int[] tempArray = new int[lengthOfinput];
            for (int j = 0; j < lengthOfinput; j++) {
                int tempearture = sc.nextInt();
                tempArray[j] = tempearture;
            }
            Arrays.sort(tempArray);
            System.out.println(tempArray[1]);
        }
    }
}
