package Two_Pointer;


//392. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false

public class Is_Subsequent {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        int s_index = 0;
        int t_index = 0;

        while (s_index < s.length() && t_index < t.length()) {
            if (s.charAt(s_index) == t.charAt(t_index)) {
                s_index++;
            }
            t_index++;
        }
        System.out.println(s_index == s.length());
    }
}