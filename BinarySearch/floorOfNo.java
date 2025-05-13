package BinarySearch;

public class floorOfNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 21;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
        int s = 0;
        int end = arr.length -1;

        while(s <= end){
            int mid = s + (end - s)/2;
            if(target > arr[mid]){
                s = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
