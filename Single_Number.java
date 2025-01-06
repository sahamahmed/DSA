import java.util.HashMap;
import java.util.Map;

public class Single_Number {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    // this solution gives O(n) time complexity and O(n) space complexity. while the with xor operation gives O(n) time complexity and O(1) space complexity.
    //this is the solution using xor operation
    // public static int singleNumber(int[] nums) {
    //     int result = 0;
    //     for (int num: nums) {
    //         result ^= num;
    //     }
    //     return result;
    // }
    

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
