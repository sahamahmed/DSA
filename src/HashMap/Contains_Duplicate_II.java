package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        System.out.println(map);
       return false;
    }
}
