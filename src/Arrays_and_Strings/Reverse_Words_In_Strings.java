package Arrays_and_Strings;

import java.util.Arrays;

//Approach
// The input string s is trimmed to remove any leading or trailing spaces using the trim() method.
// The trimmed string is then split into an array of words using the split("\\s+") method. The regular expression "\s+" matches one or more whitespace characters, effectively separating the words.
// A variable out is initialized as an empty string to store the reversed words.
// Starting from the last word in the array (str.length - 1), the loop iterates backwards until the first word (index 0) is reached.
// In each iteration, the current word str[i] is appended to out along with a space (" ") to separate the words.
// Finally, the first word str[0] is appended to out.
// The reversed string of words, stored in out, is returned as the result.

public class Reverse_Words_In_Strings {
    public static void main(String[] args) {
        // System.out.println(reverseWords("the sky is blue"));
        // System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords(" a good    example"));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        String out = "";
        for (int i = words.length - 1; i > 0; i--) {
            System.out.println(words[i]);
             out+= words[i] + " ";
        }
        return out + words[0];
    }
}
