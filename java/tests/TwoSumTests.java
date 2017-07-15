import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTests {
    private TwoSum twoSum;

    @BeforeEach
    void init() {
        this.twoSum = new TwoSum();
    }

    @Test
    void testTwoElementList() {
        int[] nums = {1,2};
        int[] solution = {0,1};

        Assertions.assertArrayEquals(solution, this.twoSum.twoSum(nums, 3));
    }

    @Test
    void testMiddleItems() {
        int[] nums = {1,3,7,2,6};
        int[] solution = {1,3};

        Assertions.assertArrayEquals(solution, this.twoSum.twoSum(nums, 5));
    }
}
