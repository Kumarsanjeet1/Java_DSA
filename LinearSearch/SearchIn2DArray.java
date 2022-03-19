package LinearSearch;
// Question: Search element in the 2D Array!
// nums= { {2, 6, 34}
//         {4, 64, 54}
//         {3,  6,  7}
//        }
// Input: target = 64
// Output: [1, 1]

import java.util.Arrays;

public class SearchIn2DArray {
// Method for Searching the target element in the 2D array !
    static int [] search(int [] [] nums, int target){
//  In the first loop searching element in row,
//  & in the second loop searching the loop in column.
        for(int row = 0; row < nums.length; row++ ){
            for(int col=0; col <= row; col++){
                if (target == nums[row][col]){
                    int []  ans = {row,col};
                    return ans;
                }
            }
        }
        return new int [] {-1,-1};
    }

    public static void main(String[] args) {
        int [] [] nums={ {2, 6, 34},
                         {4, 64, 54},
                         {3,  6,  7}
                        };
        int target = 4;
        System.out.println(Arrays.toString( search(nums, target)));
    }
}
