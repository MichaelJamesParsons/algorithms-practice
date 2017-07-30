package UniqueString;

/**
 * Cracking the coding interview
 * Strings | Problem 1.1
 */
class UniqueString {
    boolean isUnique(String s) {
        int bitMap = 0;
        for(int i = 0; i < s.length(); i++) {
            if((bitMap & (1 << (s.charAt(i) - 'a'))) > 0) {
                return false;
            }

            bitMap |= 1 << (s.charAt(i) - 'a');
        }

        return true;
    }
}
