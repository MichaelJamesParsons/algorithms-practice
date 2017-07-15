import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTests {
    private AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void init() {
        this.addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void testSingleDigitNoCarry() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);

        Assertions.assertEquals(7, this.calculateSum(l1, l2));
    }

    @Test
    void testSingleDigitWithCarry() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        Assertions.assertEquals(10, this.calculateSum(l1, l2));
    }

    @Test
    void testMultipleDigitsWithVaryingLength() {
        ListNode l1a = new ListNode(1);
        ListNode l1b = new ListNode(2);
        ListNode l1c = new ListNode(3);
        ListNode l1d = new ListNode(4);

        l1a.next = l1b;
        l1b.next = l1c;
        l1c.next = l1d;

        ListNode l2a = new ListNode(2);
        ListNode l2b = new ListNode(8);
        ListNode l2c = new ListNode(9);

        l2a.next = l2b;
        l2b.next = l2c;

        Assertions.assertEquals(5303, this.calculateSum(l1a, l2a));
    }

    private int calculateSum(ListNode l1, ListNode l2) {
        ListNode result = this.addTwoNumbers.addTwoNumbers(l1, l2);
        int sum = 0;
        int offset = 0;
        while (result != null) {
            sum += result.val * Math.pow(10, offset);
            result = result.next;
            offset++;
        }

        return sum;
    }
}