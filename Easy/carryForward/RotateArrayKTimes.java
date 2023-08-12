package git.Easy.carryForward;

/*
 * For rotating the array k time right side we need to reverse the whole array and then reverse the 0 to k elements and then reverse the k to N-1 elements
 * Step 1: Reverse the whole array 0 to N-1
 * Step 2: Reverse the resulting array from 0 to n-k elements.
 * Step 3: Reverse the resulting array from k to n-1 elements
 * Corner case:
 * If the array length is less than k then we need to rotate only k%length times
 * If the array length and k is equal then return the array directly
 */
public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] array = {5, 6, 9, 2, 3};
        int k = 3;
        if (k == array.length) {
            System.out.println(array);
        }
        if (k > array.length) {
            k = k % array.length;
        }
        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, array.length - 1);
        System.out.println(array);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
