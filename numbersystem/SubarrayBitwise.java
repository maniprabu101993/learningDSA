package git.numbersystem;

public class SubarrayBitwise {
    public static void main(String[] args) {
        int A=100000;
        int B[]={1,0,0,0,1};
            long numberOfTotalSubArrays=((long) A *(A+1))/2;
            long numberOfZeroSubarrays=0;
            long counterOfZeros=0;
            for(int i=0;i<A;i++){
                if(B[i]==0){
                    counterOfZeros++;
                }else{
                    numberOfZeroSubarrays=numberOfZeroSubarrays+((counterOfZeros*(counterOfZeros+1))/2);
                    counterOfZeros=0;
                }
            }
            if(counterOfZeros>0){
                numberOfZeroSubarrays = numberOfZeroSubarrays+((counterOfZeros*(counterOfZeros+1))/2);
            }
        System.out.println((long)(numberOfTotalSubArrays-numberOfZeroSubarrays));

    }
}
