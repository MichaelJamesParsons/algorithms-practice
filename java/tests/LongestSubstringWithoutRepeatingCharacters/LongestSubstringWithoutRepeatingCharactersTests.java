package LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTests {
    private LongestSubstringWithoutRepeatingCharacters longestSubstr;

    @BeforeEach
    void init() {
        this.longestSubstr = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void testExample1() {
        Assertions.assertEquals(3, this.longestSubstr.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void testExample2() {
        Assertions.assertEquals(1, this.longestSubstr.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void testExample3() {
        Assertions.assertEquals(3, this.longestSubstr.lengthOfLongestSubstring("pwwkew"));
    }
}
