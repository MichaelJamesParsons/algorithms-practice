/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    if (l1 === null) {
        return l2;
    } else if (l2 === null) {
        return l1;
    }

    var head;
    if (l1.val < l2.val) {
        head = l1;
        l1 = l1.next;
    } else {
        head = l2;
        l2 = l2.next;
    }

    var pointer = head;
    while (l1 !== null || l2 !== null) {
        if (l1 !== null && (l2 === null || l1.val < l2.val)) {
            pointer.next = l1;
            pointer = pointer.next;
            l1 = l1.next;
        } else {
            pointer.next = l2;
            pointer = pointer.next;
            l2 = l2.next;
        }
    }

    return head;
};