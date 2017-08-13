package longest_palindromic_substring

import "testing"

func TestExample1(t *testing.T) {
	if longestPalindrome("bab") != "bab" {
		t.Error("expects bab")
	}
}

func TestExample2(t *testing.T) {
	if longestPalindrome("cbbd") != "bb" {
		t.Error("expects bb")
	}
}

func TestEmptyString(t *testing.T) {
	if longestPalindrome("") != "" {
		t.Error("expects empty string")
	}
}

func TestNonPalindrome(t *testing.T) {
	if len(longestPalindrome("abcdefghijklmnop")) != 1 {
		t.Error("expects single character")
	}
}

func TestPalindrome(t *testing.T) {
	if longestPalindrome("racecar") != "racecar" {
		t.Error("expects racecar")
	}
}
