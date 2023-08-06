package git.Easy.carryForward;

/*
* If 1 is there dont toggle the switches ,if 0 is there toggle all the switches right side to it including it.
* Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
* here we have two approaches where the 1 st brute force approach is having O(N^2) time complexity
* Second optimized approach has O(N) time complexity;
* Space complexity for both approaches are O(1)
* Eg: [0,1,1,0,1]
*      1st step => [1,0,0,1,0]  counter=1
*      2nd step => [1,1,1,0,1]  counter=2  In this step the right side elements to the current elements seems to be same as 0th step
*      3rd step => [1,1,1,1,0]  counter=3
*      4th step => [1,1,1,1,1]  counter=4  In this step the right side elements to the current elements seems to be same as 0th step
*      output = 4
*
*    so if the counter is in even numbers dont do anything, if the counter is in odd numbers toggle the elements including ith element
*    After toggling if the current element is 0 then increment the counter and if the current element is 1 dont increment the counter.
* */
public class BulbToggle {
    public static void main(String[] args) {
        int[] input = {0,1,1,0,1};
        System.out.println(getState(input));
//        System.out.println(getStateOptimized(input));
    }

    public static int getState(int[] input) {
        int totalCount = 0;
        for (int i = 0; i < input.length; i++) {           //
           if(input[i]==0){                                //
               for(int j=i;j<input.length;j++){            //
                   input[j]=1-input[j];                    //
               }                                           // Time complexity is O(N^2)
               totalCount++;                               //
           }                                               //
        }                                                  //
        return totalCount;
    }

    public static int getStateOptimized(int[] input) {          //
        int totalCount = 0;                                     //
        for (int i = 0; i < input.length; i++) {                //
            if (totalCount % 2 != 0) {                          //
                input[i] = 1 - input[i];                        //   Time complexity O(N)
            }                                                   //
            if (input[i] == 0) {                                //
                totalCount++;                                   //
            }                                                   //
        }                                                       //
        return totalCount;
    }
}
