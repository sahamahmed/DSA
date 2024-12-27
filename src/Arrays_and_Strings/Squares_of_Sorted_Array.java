package Arrays_and_Strings;
import java.util.Arrays;

//977. Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//
//
//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
//Example 2:
//
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]


public class Squares_of_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-5, -3, -2, -1};
        int n = nums.length;
        int[] result = new int[n];

        int i = 0;          // Start pointer
        int j = n - 1;      // End pointer
        int k = n - 1;      // Position in the result array (from the end)

        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[k] = nums[i] * nums[i];
                i++;
            } else {
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }

        // Output the result
        System.out.println(Arrays.toString(result));
    }
}
