package Array;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,5,6,77,22};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxval = 0;
        for (int j : arr) {
            if (j > maxval) {
                maxval = j;
            }
        }
        return maxval;
    }
}