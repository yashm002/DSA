package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,10,23,43,66,89,99,100};
        int target = 89;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start , int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
