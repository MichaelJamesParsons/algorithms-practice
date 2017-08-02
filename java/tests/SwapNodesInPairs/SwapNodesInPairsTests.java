package SwapNodesInPairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapNodesInPairsTests {
    private SwapNodesInPairs swap;

    @BeforeEach
    void init () {
        this.swap = new SwapNodesInPairs();
    }

    @Test
    void testEmptyList () {
        Assertions.assertEquals(null, this.swap.swapPairs(null));
    }

    @Test
    void testSingleElementList () {
        ListNode head = new ListNode(1);
        Assertions.assertEquals(head, this.swap.swapPairs(head));
    }

    @Test
    void testEvenElementList () {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        ListNode result = this.swap.swapPairs(head);

        Assertions.assertEquals(l1, result);
        Assertions.assertEquals(head, result.next);
        Assertions.assertEquals(l3, result.next.next);
        Assertions.assertEquals(l2, result.next.next.next);
        Assertions.assertEquals(null, result.next.next.next.next);
    }

    @Test
    void testOddElementList () {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        head.next = l1;
        l1.next = l2;

        ListNode result = this.swap.swapPairs(head);

        Assertions.assertEquals(l1, result);
        Assertions.assertEquals(head, result.next);
        Assertions.assertEquals(l2, result.next.next);
        Assertions.assertEquals(null, result.next.next.next);
    }
}
