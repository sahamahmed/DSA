package Arrays_and_Strings;

public class Index_Of_First_Occurence {
    public static void main(String[] args) {
        
        System.out.println(indexOfFirstOccurence("hello", "ll"));
    }

    public static int indexOfFirstOccurence(String haystack, String needle) {
       for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        int k;
        for (k=0; k < needle.length();k++) {
            if (haystack.charAt(i + k) != needle.charAt(k)) {
                break;
                
            }
        }
        if (k == needle.length()) {
            return i;
        }

       }
       return -1;
    }
}
