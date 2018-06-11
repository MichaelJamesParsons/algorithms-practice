/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    var head = new ListNode(0);
    var pointer = head;
    var carry = 0;
    var x;
    var y;
    while (l1 !== null || l2 !== null) {
        if (l1 !== null) {
            x = l1.val;
            l1 = l1.next;
        } else {
            x = 0;
        }

        if (l2 !== null) {
            y = l2.val;
            l2 = l2.next;
        } else {
            y = 0;
        }

        pointer.next = new ListNode((x + y + carry) % 10);
        pointer = pointer.next;
        carry = Math.floor((x + y + carry) / 10);
    }

    if (carry !== 0) {
        pointer.next = new ListNode(carry);
    }

    return head.next;
};