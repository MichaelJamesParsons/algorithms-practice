package PalindromeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeNumberTests {
    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void init() {
        this.palindromeNumber = new PalindromeNumber();
    }

    @Test
    void testSingleDigit() {
        Assertions.assertEquals(true, this.palindromeNumber.isPalindrome(0));
    }

    @Test
    void testNonPalindromeEvenNumCharacters() {
        Assertions.assertEquals(false, this.palindromeNumber.isPalindrome(12));
    }

    @Test
    void testPalindromeEvenNumCharacters() {
        Assertions.assertEquals(true, this.palindromeNumber.isPalindrome(22));
    }

    @Test
    void testNonPalindromeOddNumCharacters() {
        Assertions.assertEquals(false, this.palindromeNumber.isPalindrome(123));
    }

    @Test
    void testPalindromeOddNumCharacters() {
        Assertions.assertEquals(true, this.palindromeNumber.isPalindrome(424));
    }

    @Test
    void testPalindromeTenNumCharacters() {
        Assertions.assertEquals(true, this.palindromeNumber.isPalindrome(1234554321));
    }

    @Test
    void testNonPalindromeTenNumCharacters() {
        Assertions.assertEquals(false, this.palindromeNumber.isPalindrome(1533447351));
    }

    @Test
    void testNegativeNonPalindrome() {
        Assertions.assertEquals(false, this.palindromeNumber.isPalindrome(-2147483648));
    }

    @Test
    void testNegativePalindrome() {
        Assertions.assertEquals(false, this.palindromeNumber.isPalindrome(-12321));
    }
}
