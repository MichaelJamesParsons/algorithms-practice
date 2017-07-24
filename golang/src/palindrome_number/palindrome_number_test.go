package palindrome_number

import "testing"

func TestSingleDigit(t *testing.T) {
	if !isPalindrome(0) {
		t.Error("0 is a palindrome. Expected true, got false.")
	}
}

func TestNonPalindromeEvenNumChars(t *testing.T) {
	if isPalindrome(12) {
		t.Error("12 is not a palindrome. Expected false, got true.")
	}
}

func TestPalindromeEvenNumChars(t *testing.T) {
	if !isPalindrome(22) {
		t.Error("22 is a palindrome. Expected true, got false.")
	}
}

func TestPalindromeOddNumChars(t *testing.T) {
	if !isPalindrome(424) {
		t.Error("424 is a palindrome. Expected true, got false.")
	}
}

func TestPalindromeTenNumChars(t *testing.T) {
	if !isPalindrome(1234554321) {
		t.Error("1234554321 is a palindrome. Expected true, got false.")
	}
}

func TestNonPalindromeTenNumCharacters(t *testing.T) {
	if isPalindrome(533447351) {
		t.Error("533447351 is not a palindrome. Expected false, got true.")
	}
}

func TestNegativeMinInt(t *testing.T) {
	if isPalindrome(-2147483648) {
		t.Error("-2147483648 is not a palindrome. Expected false, got true.")
	}
}
/*
@Test
    @Test
    void testNegativeNonPalindrome() {
        Assertions.assertEquals(false, this.palindromeNumber.isPalindrome(-2147483648));
    }

    @Test
    void testNegativePalindrome() {
        Assertions.assertEquals(false, this.palindromeNumber.isPalindrome(-12321));
    }
 */