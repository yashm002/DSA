package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {43, 34, 90, 53, 32, 38, 22, 29};
        int targetval = 32;
        int result = linear(nums, targetval,1, 6);
        System.out.println(result);
    }

    static int linear(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if(arr[index]== target){
                return index;
            }
        }
        return -1;
    }
}