package MergeKSortedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeKSortedListsTests {
    private MergeKSortedLists sorter;

    @BeforeEach
    void init() {
        this.sorter = new MergeKSortedLists();
    }

    @Test
    void testEmptySet() {
        ListNode[] list = new ListNode[0];
        Assertions.assertNull(sorter.mergeKLists(list));
    }

    @Test
    void testSetOfEmptyLists() {
        ListNode[] list = new ListNode[3];
        list[0] = null;
        list[1] = null;
        list[2] = null;

        Assertions.assertNull(sorter.mergeKLists(list));
    }

    @Test
    void testAscLists() {
        ListNode[] list = new ListNode[3];
        list[0] = new ListNode(1);
        list[1] = new ListNode(2);
        list[2] = new ListNode(3);

        ListNode result = sorter.mergeKLists(list);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(1, result.val);

        Assertions.assertNotNull(result.next);
        Assertions.assertEquals(2, result.next.val);

        Assertions.assertNotNull(result.next.next);
        Assertions.assertEquals(3, result.next.next.val);
    }

    @Test
    void testDescLists() {
        ListNode[] list = new ListNode[3];
        list[0] = new ListNode(3);
        list[1] = new ListNode(2);
        list[2] = new ListNode(1);

        ListNode result = sorter.mergeKLists(list);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(1, result.val);

        Assertions.assertNotNull(result.next);
        Assertions.assertEquals(2, result.next.val);

        Assertions.assertNotNull(result.next.next);
        Assertions.assertEquals(3, result.next.next.val);
    }
}
