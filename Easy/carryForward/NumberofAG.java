package git.Easy.carryForward;

/*
* Find the pair of AG in the given array.It should count the pair of GA only AG it should count.
* Start from the right end of the array and if you see a G increment the counter and if you see A add the counter to total count.
* Time complexity for this solution is O(N)
* Space complexity for this solution is O(1)
*
* Eg: input: AAGA
*      Total pairs (0,1)and (0,2).So count is 2.
*      once you see the G ,counter =1;
*      once you see the A after G , total = total+count;
*      input[3]=A , countofG=0, total =0;
*      input[2]=G , countofG=1 , total =0;
*      input[1]=A , countofG=1 , total =total+countofG => 0+1;=>1;
*      input[2]=A , countofG=1 , total+countofG => 1+1;=>2;
*
* */
public class NumberofAG {
    public static void main(String[] args) {
        String s="AAGA";
        System.out.println(solve(s));
    }
    public static int solve(String A) {
        char[] array=A.toCharArray();
        int counter=0;
        int totalPairCount=0;
        if(A.length()==1){
            return 0;
        }
        for(int i=A.length()-1;i>=0;i--){                           //
            if(array[i]=='G'){                                      //
                counter= counter+1;                                 //
            }else if(array[i]=='A'){                                //   Time complexity O(N)
                totalPairCount=totalPairCount+counter;              //
            }                                                       //
        }                                                           //
        return totalPairCount;
    }
}
