package Sliding_Window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substring_with_Concatenation_of_All_Words {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring(s, words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        int wordLength = words[0].length();
        int totalWords = words.length;
        List<Integer> result = new ArrayList<>();

        // Build the frequency map for the words
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Iterate through possible starting points within the word length
        for (int i = 0; i < wordLength; i++) {
            int left = i, right = i;
            Map<String, Integer> seen = new HashMap<>();
            int count = 0; // Number of valid words in the current window

            while (right + wordLength <= s.length()) {
                // Extract the next word from the right side of the window
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordCount.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    // If we see a word too many times, shrink the window from the left
                    while (seen.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        count--;
                        left += wordLength;
                    }

                    // If the window contains exactly all the words, add the start index
                    if (count == totalWords) {
                        result.add(left);
                    }
                } else {
                    // Reset the window if an invalid word is found
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}
