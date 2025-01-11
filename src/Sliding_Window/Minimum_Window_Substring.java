package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int index = -1;
        int minLength = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        int L = 0;
        // populating the map with values from t array
        for(int i = 0; i<m; i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        for(int R = 0; R<n; R++) {
            if(map.getOrDefault(s.charAt(R), 0) > 0)
                count++;
            
            map.put(s.charAt(R), map.getOrDefault(s.charAt(R), 0) - 1);
            while(count == m) {
                // think about shrinking the window
                // by shrinking the window we are actually adding back the elements in the hash  
                int l = R - L + 1;
                if(l < minLength) {
                    minLength = l;
                    index = L;
                }

                map.put(s.charAt(L), map.getOrDefault(s.charAt(L), 0) + 1);
                if(map.getOrDefault(s.charAt(L), 0) > 0)
                    count--;
                L++;
            }
        }
        return index == -1 ? "" : s.substring(index, index + minLength);
    }
}
