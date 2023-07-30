package git.Arrays;

public class ArrayUpdate {
    public static void main(String[] args) {
        int[] value={10,20,30,40,50};
        fun(value);
        System.out.println(value[3]);
    }

    static void fun(int[] arr){
        arr[3]=55;
        return;
    };
}
