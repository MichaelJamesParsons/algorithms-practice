package AddTwoNumbers;

class AddTwoNumbers {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = carry;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;

            if (head == null) {
                head = node;
                current = head;
            } else {
                current.next = node;
                current = current.next;
            }
        }

        if(carry != 0) {
            current.next = new ListNode(carry);
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
