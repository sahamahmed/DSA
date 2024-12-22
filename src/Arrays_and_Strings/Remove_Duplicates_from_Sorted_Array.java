package Arrays_and_Strings;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = nums.length > 0 ? 1 : 0;
        int p1 = 1;
        int p2;
        for (p2 = 1 ; p2 < nums.length; p2++) {
           if (nums[p2] != nums[p2-1]) {
               nums[p1++] = nums[p2];
               k++;
           }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
