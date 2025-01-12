package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "cat cat cat cat";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
       String[] words = s.split(" ");
       if (pattern.length() != words.length) {
           return false;
       }
       Map<Character, String> map = new HashMap<>();    
       for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                    }
            } else if ( map.containsValue(words[i])) {
                return false;
            }
            else {
                map.put(pattern.charAt(i), words[i]);
            }
       }
       return true;
    }
}
