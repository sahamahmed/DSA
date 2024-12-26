package Arrays_and_Strings;

//217. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//
//Output: true
//
//Explanation:
//
//The element 1 occurs at the indices 0 and 3.
//
//Example 2:
//
//Input: nums = [1,2,3,4]
//
//Output: false
//
//Explanation:
//
//All elements are distinct.
//
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//
//Output: true

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            if (set.contains(nums[i])) {
                System.out.println(nums[i] + " is already in the set");
            }
            set.add(nums[i]);
        }
        System.out.println(false);
    }
}
