package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrNoCol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {1,2,3}, //0th index
                {4,5},   //1st index
                {6,7,8,9} //2nd index
        };

//        int[][] arr = new int[3][];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}