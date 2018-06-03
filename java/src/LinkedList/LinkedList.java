package LinkedList;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedList {
    private ListNode head;

    private ListNode getNode(int index) {
        ListNode n = this.head;
        int i = 0;

        if (index < 0) {
            return null;
        }

        while(n != null) {
            if (i == index) {
                return n;
            }

            n = n.next;
            i++;
        }

        return null;
    }

    public int get(int index) {
        ListNode n = this.getNode(index);

        if (n != null) {
            return n.val;
        }

        return -1;
    }

    public void addAtHead(int val) {
        ListNode n = new ListNode(val);

        if (this.head != null) {
            n.next = this.head;
        }

        this.head = n;
    }

    public void addAtTail(int val) {
        ListNode n = this.head;

        if (n == null) {
            this.head = new ListNode(val);
            return;
        }

        while(n.next != null) {
            n = n.next;
        }

        n.next = new ListNode(val);
    }

    public void addAtIndex(int index, int val) {
        ListNode nodeToAdd = new ListNode(val);

        if (index == 0) {
            if (this.head != null) {
                nodeToAdd.next = this.head;
            }

            this.head = nodeToAdd;
            return;
        }

        ListNode n = this.getNode(index - 1);

        if (n != null) {
            nodeToAdd.next = n.next;
            n.next = nodeToAdd;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (this.head != null) {
                this.head = this.head.next;
            }

            return;
        }

        ListNode n = this.getNode(index - 1);

        if (n != null && n.next != null) {
            n.next = n.next.next;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        // If a cycle does not exist, fast will reach
        // the end first.
        while (fast != null && fast.next != null) {
            // On first iteration, it's likely the pointers are
            // in different positions, so we might as well move
            // them before making comparisons.
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
