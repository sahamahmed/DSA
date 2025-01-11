package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransomNote = "agb";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : magazine.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.getOrDefault(ransomNote.charAt(i), 0) > 0) {
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
