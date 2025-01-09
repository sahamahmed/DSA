package Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_No_Repeating {
	public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
     int L = 0;
     int length = 0;
     Set<Character> set = new HashSet<>();
    for (int R = 0; R < s.length(); R++) {
        while ( set.contains(s.charAt(R))) {
            set.remove(s.charAt(L));
            L++;
        }
        set.add(s.charAt(R));
        length = Math.max(length, R - L + 1);
    }
    return length;
    }
}
