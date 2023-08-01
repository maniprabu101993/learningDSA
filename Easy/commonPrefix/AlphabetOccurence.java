package git.Easy.commonPrefix;

public class AlphabetOccurence {
    /**
     * Here the time complexity is O(N*Q) where Q is the query range
     * Time complexity is O(1) as we are not creating any new array other than what is asked.
     * We can reduce this time complexity by using prefix sum
     */
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'a', 'c' }; // N -> length of input
        char toFind = 'b';
        int[][] range = {{4, 4}, {1, 4}, {2, 3}, {0, 3}}; //Q -> length of query range
        int[] output = new int[range.length];
        int counter = 0;
        for (int i = 0; i < range.length; i++) {
            int start = range[i][0];
            int end = range[i][1];
            for (int j = start; j <= end; j++) {
                if (toFind == array[i]) {
                    counter++;
                }
            }
            System.out.println(counter);
            output[i] = counter;
        }
    }
}
