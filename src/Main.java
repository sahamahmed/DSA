import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int p1  = 0;
        int p2 = 0;
        while (p2 < nums.length) {
            int count = 1;
            while (p2 + 1 < nums.length && nums[p2] == nums[p2 + 1]) {
                count++;
                p2++;
            }
            nums[p1] = nums[p2];
            p1++;
            if (count > 1) {
                nums[p1] = nums[p2];
                p1++;
            }
            p2++;
        }



        System.out.println(Arrays.toString(nums));
        System.out.println(p1);
    }
}
