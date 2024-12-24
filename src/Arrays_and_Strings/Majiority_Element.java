package Arrays_and_Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majiority_Element {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        for (int j = 0; j < n; j++) {
            if (map.containsKey(arr[j])) {
                map.put(arr[j], map.get(arr[j]) + 1);
            } else {
                map.put(arr[j], 1);
            }
        }

        int majiority = n/2;
        int result = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majiority) {
                result = entry.getKey();
            }
        }

        System.out.println(result);
    }
}
