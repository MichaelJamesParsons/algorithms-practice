package LongestCommonPrefix;

class LongestCommonPrefix {
    String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int charPointer = 0;
        Character currChar;

        if(strs.length == 0) {
            return "";
        }

        outerLoop:
        while(true) {
            currChar = null;
            for(String s : strs) {
                if(charPointer > s.length() - 1) {
                    break outerLoop;
                }

                if(currChar == null) {
                    currChar = s.charAt(charPointer);
                } else if(currChar != s.charAt(charPointer)) {
                    break outerLoop;
                }
            }

            prefix.append(currChar);
            charPointer++;
        }

        return prefix.toString();
    }
}
