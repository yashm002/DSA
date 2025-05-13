package Recursion;

public class BSusingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 66, 77, 78, 88};
        int target = 6;
        System.out.println(bs(arr, target, 0, arr.length - 1));
    }

    static int bs(int[] arr, int target, int s, int e) {
        int m = s + (e - s) / 2;
        if (s > e) {
            return -1;
        }
        if (target == arr[m]) {
            return m;
        }
        if (target < arr[m]) {
            return bs(arr, target, s, m - 1);
        }
        return bs(arr, target, m + 1, e);
    }
}
