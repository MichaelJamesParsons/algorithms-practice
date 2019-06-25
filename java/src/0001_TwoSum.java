import java.util.HashMap;

public class Solution {
  /**
   * Given a list of integers and a target integer, returns the indexes of two
   * of the numbers in the list that equal the target integer. Returns an empty
   * list of no two integers exist.
   */
  public int[] twoSum(int[] nums, int target) {
    // A map where the value is the index of an integer in the list and the key
    // is the difference between the target and the value at that index.
    HashMap<Number, Number> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (map.containsKey(diff)) {
        return new int[]{(int)map.get(diff), i};
      }

      map.put(nums[i], i);
    }

    return new int[2];
  }
}