import java.util.HashMap;

class TwoSum {
    int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int x = 0; x < nums.length; x++) {
            int diff = target - nums[x];

            if(seen.containsKey(diff)) {
                return new int[]{seen.get(diff), x};
            }

            seen.put(nums[x], x);
        }

        return nums;
    }
}
