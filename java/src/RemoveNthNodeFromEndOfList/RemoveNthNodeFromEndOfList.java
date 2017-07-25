package RemoveNthNodeFromEndOfList;

class RemoveNthNodeFromEndOfList {
    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nthNode = head;
        ListNode end = head;

        if (head.next == null) {
            return null;
        }

        // Fast forward end n spaces ahead
        for(int x = 0; x < n; x++) {
            end = end.next;
        }

        // If end is null, then the first element is being removed
        if (end == null) {
            return head.next;
        }

        // Find nth element from the end
        while(end.next != null) {
            nthNode = nthNode.next;
            end = end.next;
        }

        // Remove nth element from the end
        if(nthNode.next != null) {
            nthNode.next = nthNode.next.next;
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
