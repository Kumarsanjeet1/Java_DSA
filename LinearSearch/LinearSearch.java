import java.sql.SQLOutput;

// Linear Search is one of the technique of searching algorithm,
// where we can search the element from the collection of data.
// Linear Search says that the search the element from the first (0th) index till that you are looking for the element.
/*
Question:- Find whether 14 exists in the array or not ?
            array = [ 18, 12, 6, 46. 64. 14, 34, 3]
            if element found, then print Element is found ,
            else print Element not found
 */
public class LinearSearch {

     static  int linearAlgo(int [] nums, int target){
         if (nums.length == 0) {
             return -1;
         }
//    Searching the element in the array
         for(int index =0; index < nums.length; index++){
             int element = nums[index];
//    Comparing the element is equal to target!
             if(element == target){
                 return index;
             }
            }
//    This line will execute if none of the return statements above have executed
//      hence the target not found
         return -1;
    }
    public static void main(String[] args) {
         int [] arr = {18, 12, 6, 46, 64, 14, 34, 3};
         int target = 34;
        System.out.println("Element at Index No: " + linearAlgo(arr,target));
    }
}
