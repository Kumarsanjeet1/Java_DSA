package LinearSearch;
//Question:- Search the target element in the range of the array given index.
//For example:- arr = [34, 54, 32, 65, 77, 23, 45, 22, 33, 675, 34]
//Input: target = 77, and given range is- rangeStart = 3, rangeTill= 7;
//Output: If Your target element exist in the array, then return true!
public class SearchInRange {
//Method for Search the element in indexes range!
    static  Boolean searchElement(int [] nums, int target, int startRange, int endRange){
//   If there was no element in the array, return false!
        if(nums.length == 0){
            return false;
        }
//   Searching the element in range from startRange to endRange!
        for(int index= startRange; index <= endRange; index++){
//   If the element will found, then return true!
            if (target == nums[index]){
                 return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {34, 54, 32, 65, 77, 23, 45, 22, 33, 675, 34};
        int target = 77;
        int startRange= 3;
        int endRange= 7;
        System.out.println(searchElement(nums,target, startRange, endRange));
    }

}
