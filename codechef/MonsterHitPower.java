package git.codechef;

import java.util.Scanner;

public class MonsterHitPower {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfInputs=sc.nextInt();
        for(int i=0;i<numberOfInputs;i++){
            long intialPoints= sc.nextLong();
            long pointsReduced= sc.nextLong();
            long gainPoints=sc.nextLong();
            if(pointsReduced==gainPoints){ // because this will lead to infinte loop as increasing and decreasing the same points results in same result
                System.out.println("0");
                continue;
            }
            long result = intialPoints+gainPoints-pointsReduced;
            if(result<=0){
                System.out.println("1");
                continue;
            }
            while(true){
                long locresult = result+gainPoints-pointsReduced;
                if(locresult>result){
                    System.out.println("0");
                    break;
                }
                if(locresult<=0){
                    System.out.println("1");
                    break;
                }else{
                    result=locresult;
                }
            }
        }
    }
}
