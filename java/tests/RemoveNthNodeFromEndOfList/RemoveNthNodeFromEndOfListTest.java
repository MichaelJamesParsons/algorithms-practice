package RemoveNthNodeFromEndOfList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndOfListTest {
    private RemoveNthNodeFromEndOfList remover;

    @BeforeEach
    void init() {
        this.remover = new RemoveNthNodeFromEndOfList();
    }

    @Test
    void testExample1() {
        ListNode head = new ListNode(1);
        ListNode item1 = new ListNode(2);
        ListNode item2 = new ListNode(3);
        ListNode item3 = new ListNode(4);
        ListNode item4 = new ListNode(5);
        head.next = item1;
        item1.next = item2;
        item2.next = item3;
        item3.next = item4;

        ListNode result = this.remover.removeNthFromEnd(head, 2);

        // First node == 1
        Assertions.assertEquals(1, result.val);
        Assertions.assertNotNull(result.next);

        // Second node == 2
        Assertions.assertEquals(2, result.next.val);
        Assertions.assertNotNull(result.next.next);

        // Third Node == 3
        Assertions.assertEquals(3, result.next.next.val);
        Assertions.assertNotNull(result.next.next.next);

        // Fourth Node == 5
        Assertions.assertEquals(5, result.next.next.next.val);
        Assertions.assertNull(result.next.next.next.next);
    }

    @Test
    void testSingleElement() {
        ListNode head = new ListNode(1);
        ListNode result = this.remover.removeNthFromEnd(head, 1);

        Assertions.assertNull(result);
    }

    @Test
    void testLastElement() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = this.remover.removeNthFromEnd(head, 2);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.val);
    }
}
