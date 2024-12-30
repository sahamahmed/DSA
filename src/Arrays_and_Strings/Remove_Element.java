package Arrays_and_Strings;

public class Remove_Element {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = nums.length;
        int p1 = nums.length -1, i = 0;
        while( i < nums.length && p1 >= i ){
            while ( p1 >=0 && nums[p1] == val ) {
                p1--;
                k--;
            }
            if (nums[i] == val && p1 >0 && p1 >= i  ) {
                int temp = nums[p1];
                nums[p1--] = nums[i];
                nums[i++] = temp;
                k--;
            } else {
                i++;
            }
        }
        System.out.println(k);
    }
}
