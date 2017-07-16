class PalindromeNumber {
    boolean isPalindrome(int x) {
        if (x == Integer.MIN_VALUE || x < 0) {
            return false;
        }

        int length = (int)(Math.floor(Math.log10(x)));
        int offset = (length % 2 == 0) ? 0 : 1;

        for(int y = 0; y < length / 2 + offset; y++) {
            int left = (int)(x/Math.pow(10, length - y) % 10);
            int right = (int)(x % Math.pow(10, y+1) / Math.pow(10, y));

            if(left != right) {
                return false;
            }
        }
        return true;
    }
}