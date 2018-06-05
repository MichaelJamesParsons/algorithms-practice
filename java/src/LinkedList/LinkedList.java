package LinkedList;

import javax.xml.soap.Node;
import java.util.HashMap;

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

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        // Both slow and fast must start at head. If fast were to begin at head.next,
        // they would never meet if the cycle were of length 2.
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        // No cycle found
        if (!isCycle) {
            return null;
        }

        // The distance between the point where fast/slow meet and the start of the cycle
        // is the same as the distance between head and the start of the cycle.
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != null) {
            a = a.next;
            lengthA++;
        }

        while (b != null) {
            b = b.next;
            lengthB++;
        }

        int x = 0;
        a = headA;
        b = headB;
        if (lengthA > lengthB) {
            while (x < lengthA - lengthB) {
                a = a.next;
                x++;
            }
        } else if (lengthB > lengthA) {
            while (x < lengthB - lengthA) {
                b = b.next;
                x++;
            }
        }

        while (a != null && b != null) {
            if (a == b) {
                return a;
            }

            a = a.next;
            b = b.next;
        }

        return null;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null) {
            return null;
        }

        int x = 0;
        while (x < n) {
            fast = fast.next;
            x++;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
