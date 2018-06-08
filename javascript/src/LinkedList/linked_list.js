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

var removeElements = function(head, val) {
    while (head !== null && head.val === val) {
        head = head.next
    }

    if (head === null) {
        return null;
    }

    var pointer = head;
    while (pointer !== null && pointer.next !== null) {
        if (pointer.next.val === val) {
            pointer.next = pointer.next.next;
        } else {
            pointer = pointer.next
        }
    }

    return head;
};

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var oddEvenList = function(head) {
    if (head === null || head.next === null) {
        return head;
    }

    var oddPointer = head;
    var evenHead = head.next;
    var evenPointer = evenHead;
    var pointer = evenHead;
    var isOdd = true;

    while (pointer.next !== null) {
        pointer = pointer.next;

        if (isOdd) {
            oddPointer.next = pointer;
            oddPointer = oddPointer.next;
        } else {
            evenPointer.next = pointer;
            evenPointer = evenPointer.next;
        }

        isOdd = !isOdd;
    }

    if (evenPointer !== null) {
        evenPointer.next = null;
    }

    oddPointer.next = evenHead;
    return head;
};

var isPalindrome = function(head) {
    var listLength = 0;
    var pointer = head;

    if (head === null || head.next === null) {
        return true;
    }

    while (pointer != null) {
        pointer = pointer.next;
        listLength++;
    }

    var x = 0;
    var current;
    var leadPointer = head;
    while (x < Math.floor(listLength / 2)) {
        // Since the current node is behind the halfway point,
        // set it as the head of the list, effectively reversing
        // the order of the first half of the list.
        current = leadPointer;

        // Move the halfway pointer forward
        leadPointer = leadPointer.next;

        current.next = head;
        head = current;
        x++;
    }

    if (listLength % 2 !== 0) {
        leadPointer = leadPointer.next;
    }

    while (leadPointer !== null) {
        if (leadPointer.val !== head.val) {
            return false;
        }

        leadPointer = leadPointer.next;
        head = head.next;
    }

    return true;
};