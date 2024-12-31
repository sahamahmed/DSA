package Arrays_and_Strings;
import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
         int n= nums.length;
        int[] ans = new int[n];
        int prodL = 1;
        int prodR = 1;
        for (int i=n-1;i>-1;i--){
            ans[i] = prodR;
            prodR = prodR * nums[i];
        }
        for (int i=0;i<nums.length;i++){
            ans[i] = prodL *  ans[i];
            prodL = prodL * nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
