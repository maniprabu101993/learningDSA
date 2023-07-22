package git.factors;

public class FindFactorsCountOfGivenNumbers {
    /*
    * The time complexity for this approach is O(sqrt(N) which is better than O(N)
    * Eg: 100
    * The factors are 1,2,4,5,10,20,25,50,100 including the same number .so total count is 9
    * if we have 1 as factor the automatically 100 is also added as factor because 1*100 =100
    * likewise if we have 2 as factor, then 50 is also added as factor because 2*50 =100
    * */
    public static void main(String[] args) {
        int number = 100;
        int counter = 0;
        for (int i = 1; i * i <= number; i++) { // we should start from 1 as 0 is not valid and we are iterating the loop upto sqrt(n) (ie, i*i <=n)
            if (number % i == 0) {
                if (i * i == number) { // here inorder to avoid the same number counted twice we will check if same number is the factor then we will add only one to counter
                    counter = counter + 1;
                } else {
                    counter = counter + 2;
                }
            }
        }
        System.out.println("The number of factors for given number is " + counter);
    }
}
