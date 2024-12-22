package Arrays_and_Strings;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int p1 = 1;
        int count = 1;
        for (int p2 = 1 ; p2 < nums.length; p2++) {

           if (nums[p2] != nums[p2-1]) {
               count = 1;
           } else {
               count++;
           }

           if (count <= 2) {
               nums[p1++] = nums[p2];
           }
        }
        System.out.println(p1);
        System.out.println(Arrays.toString(nums));
    }
}
