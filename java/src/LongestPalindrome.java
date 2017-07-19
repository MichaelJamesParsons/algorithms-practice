class LongestPalindrome {
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

                if (j - i <= 2) {
                    table[i][j] = chars[i] == chars[j];
                } else {
                    table[i][j] = chars[i] == chars[j] && table[i+1][j-1];
                }

                if (table[i][j] && end - start < j - i) {
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
