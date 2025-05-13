package Recursion;

public class ReduceNo1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int n, int s) {
        if (n == 0) {
            return s;
        }
        if (n % 2 == 0) {
            return helper(n / 2, s + 1);
        }
        return helper(n - 1, s + 1);
    }
}
