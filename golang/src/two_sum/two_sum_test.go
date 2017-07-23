package two_sum

import "testing"

func TestTwoElementList(t *testing.T) {
	nums := []int{1,2}
	result := twoSum(nums, 3)

	if result[0] != 0 || result[1] != 1 {
		t.Error("Indecies 0 and 1 expected but not found.")
	}
}

func TestMiddleItems(t *testing.T) {
	nums := []int{1,2,3}
	result := twoSum(nums, 5)

	if result[0] != 1 || result[1] != 2 {
		t.Error("Indecies 1 and 2 expected but not returned.")
	}
}