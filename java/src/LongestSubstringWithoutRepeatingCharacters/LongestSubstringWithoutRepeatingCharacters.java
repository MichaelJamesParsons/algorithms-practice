package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

class LongestSubstringWithoutRepeatingCharacters {
    int lengthOfLongestSubstring(String s) {
        int count;
        int maxLength = 0;
        HashSet<Character> usedLetters;

        for (int i = 0; i < s.length(); i++) {
            count = 0;
            usedLetters = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (usedLetters.contains(s.charAt(j))) {
                    break;
                }

                usedLetters.add(s.charAt(j));
                count++;
            }

            if (count > maxLength) {
                maxLength = count;
            }
        }

        return maxLength;
    }
}
