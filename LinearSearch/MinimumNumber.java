package LinearSearch;
//Question: Search the Minimum number element in the array !
//  nums = {3,4,5,56,7,76,54,34,43}
//Output: 3          (Answer!)

public class MinimumNumber {
//  Method for the searching the Minimum number element the array !
    static int searchMinimum(int [] nums){
//   'ans' variable for containing the minimum number of the array !
        int ans = nums[0];
//   Here Compairing the Smallest number elemnet and Searching the minimum element !
            for(int index=1; index < nums.length; index++){
//   Here compairing the element from first index with it's next element.
                if(ans > nums[index]){
                    ans = nums[index];
                }
            }
            return ans;  // returning the smallest number element.
    }
    public static void main(String[] args) {
        int [] nums = {3,4,5,56,7,76,54,34,43};
        System.out.println(searchMinimum(nums));
    }
}
