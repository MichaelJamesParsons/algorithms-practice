package SwapNodesInPairs;

class SwapNodesInPairs {
    ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode prev = null;

        head = first.next;

        while (first != null && first.next != null) {
            ListNode tmp = first.next;
            first.next = tmp.next;
            tmp.next = first;

            if (prev != null) {
                prev.next = tmp;
            }

            prev = first;
            first = first.next;
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
    }
}