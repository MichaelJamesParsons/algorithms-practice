package LongestCommonPrefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTests {
    private LongestCommonPrefix prefix;

    @BeforeEach
    void init() {
        this.prefix = new LongestCommonPrefix();
    }

    @Test
    void testEmptyList() {
        String[] list = {};
        Assertions.assertEquals("", this.prefix.longestCommonPrefix(list));
    }

    @Test
    void testListOfEmptyStrings() {
        String[] list = new String[]{"","",""};
        Assertions.assertEquals("", this.prefix.longestCommonPrefix(list));
    }

    @Test
    void testSameStrings() {
        String[] list = new String[]{"abc","abc","abc"};
        Assertions.assertEquals("abc", this.prefix.longestCommonPrefix(list));
    }

    @Test
    void testStringsOfVaryingLength() {
        String[] list = new String[]{"ab","abc","abcd"};
        Assertions.assertEquals("ab", this.prefix.longestCommonPrefix(list));
    }

    @Test
    void testStringsWithNoCommonPrefix() {
        String[] list = new String[]{"a","b","c"};
        Assertions.assertEquals("", this.prefix.longestCommonPrefix(list));
    }
}
