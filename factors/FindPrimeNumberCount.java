package git.factors;

public class FindPrimeNumberCount {
    /*
    * Here we are using the same logic of finding the factors count and if count ==2 then it is a prime number
    * The time complexity for this logic is O(sqrt(n))
    * */
    public static void main(String[] args) {
        int number = 17;
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
        if(counter==2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime");
        }
    }
}
