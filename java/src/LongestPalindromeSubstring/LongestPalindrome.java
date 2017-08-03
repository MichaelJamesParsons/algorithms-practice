package LongestPalindromeSubstring;

class LongestPalindrome {
    /**
     * Original implementation using dynamic programming.
     *
     * First attempt, not accepted by Leet Code due to exceeding time limit. Some problems are meant to be solved
     * with dynamic programming. This is not one of them.
     *
     * @param s - The string to search for the longest palindrome.
     *
     * @return A substring of s which is the longest palindrome of s.
     */
    String longestPalindrome(String s) {
        if(s.length() == 0) {
            return "";
        }

        char[] chars = s.toCharArray();
        Boolean[][] table = new Boolean[s.length()][s.length()];
        int start = 0;
        int end = 0;

        for (int d = 0; d < s.length(); d++) {
            for (int i = 0; i < s.length() - d; i++) {
                int j = i + d;
                table[i][j] = chars[i] == chars[j] && (j-i <= 2 || table[i+1][j-1]);

                if (table[i][j] && end - start < j - i) {
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    /**
     * Optimized Implementation
     *
     * The original implementation lacked efficiency in both space and time. Many users on the forums
     * suggested a middle-out approach, which compares the characters around a pivot point and expands
     * outward.
     *
     * @param s - The string to search for the longest palindrome.
     * @return A substring of s which is the longest palindrome of s.
     */
    String longestPalindromeOptimized(String s) {
        // @todo - Implement
        return "";
    }
}
