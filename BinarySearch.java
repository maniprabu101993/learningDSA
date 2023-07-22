package git;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array= {10,20,30,40,55,60,80};
        int find = 50;
        findElementUsingBS(array,find,0,array.length);
    }

    /*
    * Time complexity O(log N) as we are dividing every step by 2
    *  How to calculate time complexity for binary search
    *  n/2,n/4,n/6,n/8...
    *  lets say n/(2^p) = 1
    *  (2^p =n) ==> if we want p then p= (log base2 n);
    * */
    public static void findElementUsingBS(int[] input,int element,int start,int end){
        while(start<=end){
            int mid= (start+end)/2;
            if(input[mid]<element){
                start=mid+1;
            }else if(input[mid]>element){
                end=mid-1;
            }else{
                System.out.println("Element found at index "+mid);
                return;
            }
        }
        if(start>end){
            System.out.println("Element not found");
        }
    }
}
