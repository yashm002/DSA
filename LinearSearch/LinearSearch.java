package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {43, 34, 90, 53, 32, 38, 22, 29};
        int targetval = 22;
        int result = linear(nums, targetval);
        System.out.println(result);
    }

    static int linear(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index]== target){
                return index;
            }
        }
        return -1;
    }
}