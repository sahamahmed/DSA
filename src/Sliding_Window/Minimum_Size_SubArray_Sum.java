package Sliding_Window;

public class Minimum_Size_SubArray_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int L = 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;
        for ( int R = 0; R < nums.length; R++ ) {
            sum+=nums[R];
            while ( sum >= target ) {
                length = Math.min(length, R - L + 1);     
                sum-= nums[L];
                L++;
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
