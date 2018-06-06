/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function (head) {
    if (head === null || head.next === null) {
        return head;
    }

    var reversedHead = null;

    while(head !== null) {
        // keep track of next node in list
        var tmp = head.next;

        // move current node to head of reversed list
        head.next = reversedHead;

        // set the added node as the head of the reversed list
        reversedHead = head;

        // set next node as head of the original list
        head = tmp;
    }

    return reversedHead;
};