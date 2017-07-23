package two_sum

func twoSum(nums []int, target int) []int {
	var result []int
	usedNums := make(map[int]int)

	for i, num := range nums {
		if val, ok := usedNums[target - num]; ok {
			return []int{val, i}
		}

		usedNums[num] = i
	}

	return result
}