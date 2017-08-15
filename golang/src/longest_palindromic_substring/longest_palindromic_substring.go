package longest_palindromic_substring

func longestPalindrome(s string) string {
	longestPalindrome := ""

	if len(s) <= 1 {
		return s
	}

	for pos := 0; pos < len(s) - 1; pos++ {

		// Even length palindromic substrings
		even := expand(s, pos, pos)
		// Odd length palindromic substrings
		odd := expand(s, pos, pos+1)

		if len(even) > len(longestPalindrome) {
			longestPalindrome = even
		}

		if len(odd) > len(longestPalindrome) {
			longestPalindrome = odd
		}
	}

	return longestPalindrome
}

func expand(s string, pos1 int, pos2 int) string {
	left := pos1
	right := pos2

	// Return the first character of a pair if it is not already a palindrome.
	if s[left:left+1] != s[right:right+1] {
		return s[left:left+1]
	}

	// Expand outward until the string ends or the next pair of characters do not match.
	for left - 1 >= 0 && right + 1 < len(s) && s[left-1:left] == s[right+1:right+2] {
		left--
		right++
	}

	return s[left:right+1]
}