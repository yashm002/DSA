package Recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,8, 8,6,29,4};
//        System.out.println(findIndex(arr,29,0));
//        findAllIndex(arr,8,0);
//        System.out.println(list);
        ArrayList<Integer> ans = findAllIndex2(arr,8,0,new ArrayList<Integer>());
        System.out.println(ans);

        System.out.println(findAllIndex3(arr, 8,0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else{
            return findIndex(arr, target, index + 1);
        }
    }

//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int[] arr, int target, int index){
//        if (index == arr.length) {
//            return;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        findAllIndex(arr, target, index + 1);
//    }


    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
