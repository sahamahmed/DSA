package Arrays_and_Strings;

public class Length_Of_last_word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("come on  "));
        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s) {
       int length = 0;
         int i = s.length() - 1;
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            while (i >= 0 && s.charAt(i) != ' ') {
                length++;
                i--;
            }
        return length;
    }
}