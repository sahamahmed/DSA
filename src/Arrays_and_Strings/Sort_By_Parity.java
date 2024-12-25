package Arrays_and_Strings;

//905. Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//Return any array that satisfies this condition.
//
//
//
//        Example 1:
//
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//Example 2:
//
//Input: nums = [0]
//Output: [0]

import java.util.Arrays;

public class Sort_By_Parity {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        if (nums.length <= 1) {
            System.out.println(Arrays.toString(nums));
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
