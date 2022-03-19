package BinarySearch;

public class BinarySearchAlgo {
//    -------------Function for Binary Search Algorithm--------------
    static int binarySearchAlgo(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
//
        while(start < end){
//      For finding middle element in the array
            int mid = start + (end - start) / 2;
//      Might be possible that the our middle element is the target element !,
            if (target == nums[mid]) return mid;

//       Might be possible that the target element will present in the left part of the given array !
            else if (target < nums[mid])  end = mid -1;

//       Might be possible that the target element will present in the right part of the given array !
            else start = mid + 1;
        }
        return  -1;
    }
//---------------Main Function------------------------
    public static void main(String[] args) {
        int [] nums = {1, 4, 5, 7, 8, 34, 54, 64, 75, 755};
        int target = 64;
        System.out.println("Target Element at index no: " + binarySearchAlgo(nums, target));
    }
}
