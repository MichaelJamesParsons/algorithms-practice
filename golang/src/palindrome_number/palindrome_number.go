package palindrome_number

import (
	"strconv"
	"math"
)

func isPalindrome(x int) bool {
	if x < 0 || x == math.MinInt32 {
		return false
	}

	numStr := strconv.FormatInt(int64(x), 10)

	for i := 0; i < len(numStr)/2; i++ {
		if numStr[i:i+1] != numStr[len(numStr) - i - 1 : len(numStr) - i] {
			return false
		}
	}

	return true
}