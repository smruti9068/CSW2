package assignment9;

import java.util.*;
public class q9 {
    public static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = '\0';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("Original string: " + input);
        char mostFrequent = findMostFrequentCharacter(input);
        System.out.println("Most frequent character: " + mostFrequent);
    }
}
