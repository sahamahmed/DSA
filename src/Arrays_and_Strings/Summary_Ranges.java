package Arrays_and_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Summary_Ranges {

    public  void main(String[] args) {
        int[] nums= {1,2,3,5,6,9};
        List<String> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        while(i < n) {
            int start = nums[i];
            while(i + 1 < n && nums[i] +1 == nums[i+1]) {
                i++;
            }
            if (start != nums[i]) {
                list.add(""+start+"->"+nums[i]);
            } else {
                list.add(""+start);
            }
            i++;
        }

        System.out.println(list);

    }
}
