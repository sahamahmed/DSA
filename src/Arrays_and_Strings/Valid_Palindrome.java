package Arrays_and_Strings;

//125. A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
 
public class Valid_Palindrome {

    public static boolean isPalindrome(String s) {
            if(s.isEmpty()) return true;
            s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
            int start = 0;
            int end = s.length() - 1;
            while(start <= end) {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
    }
    public static void main(String[] args) {
        boolean a = isPalindrome("A man, a plan, a canal: Panama");
        boolean b =isPalindrome("raceacar");
        boolean c = isPalindrome("mom");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
