/*
package BinarySearch;

public class SortedMatrix {
    public static void main(String[] args) {

    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(target == matrix[row][mid]){
                return new int[]{row,mid};
            }
            if(target > matrix[row][mid]){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
    }
}
*/


package BinarySearch;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchPotentialRow(matrix,target);
        if(rowIdx != -1) return binarySearchOverRow(rowIdx,matrix,target);
        else return false;
    }

    static int searchPotentialRow(int[][] matrix, int target){
        int start = 0;
        int end = matrix.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].length-1]){
                return mid;
            }
            else if(matrix[mid][0] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    static boolean binarySearchOverRow(int rowIdx, int[][] matrix, int target){
        int start = 0;
        int end = matrix[rowIdx].length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(matrix[rowIdx][mid] == target){
                return true;
            }
            else if(matrix[rowIdx][mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}