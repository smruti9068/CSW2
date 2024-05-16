package assignment3;

import java.util.HashMap;

public class Anagram_Checker {
    public static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a HashMap to store the frequency of characters in str1
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // Populate the HashMap with characters from str1 and their frequencies
        for (char c : str1.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Iterate through the characters of str2 and decrement the corresponding frequency in the HashMap
        // If a character is not present in the HashMap or its frequency becomes negative, return false
        for (char c : str2.toCharArray()) {
            if (!charFrequencyMap.containsKey(c)) {
                return false; // Character not present in str1, not an anagram
            }
            int frequency = charFrequencyMap.get(c);
            if (frequency == 0) {
                return false; // More occurrences of character c in str2 than in str1, not an anagram
            }
            charFrequencyMap.put(c, frequency - 1);
        }

        // If all characters in str2 are found in str1 and their frequencies match, then they are anagrams
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Check if str1 and str2 are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
