package Arrays_and_Strings;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//
//
//Example 1:
//
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//
//Input: nums = [1,0,1,1,0,1]
//Output: 2


public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1,1,1};
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++ ) {
            if(nums[i] == 1) {
                count++;
                if( max < count) {

                    max = count;
                }
            } else {
                if(max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        System.out.println(max);
        System.out.println(count);

    }
}
