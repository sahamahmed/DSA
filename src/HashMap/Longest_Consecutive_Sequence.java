package HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max_len = 0;
        Set<Integer> sett = new HashSet<>();
       if (nums.length == 0) {
        return 0;
       }
       if (nums.length == 1) {
        return 1;
       }
       for (int i = 0; i < nums.length ; i++) {
            sett.add(nums[i]);
       }

       for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) continue;
            if (sett.contains(nums[i] + 1)) {
                count++;
                max_len = Math.max(max_len, count);
            } else {
                count = 1;
            }  
       }
       return max_len;
    }
}
