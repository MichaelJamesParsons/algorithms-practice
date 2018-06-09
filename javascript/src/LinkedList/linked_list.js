/**
 * Initialize your data structure here.
 */
var MyLinkedList = function() {
    var head = null;
};

MyLinkedList.prototype.getNode = function (index) {
    var x = 0;
    var pointer = this.head;
    while (this.head !== null && x < index) {
        pointer = pointer.next;
    }

    return pointer;
};

/**
 * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
 * @param {number} index
 * @return {number}
 */
MyLinkedList.prototype.get = function(index) {
    var node = this.getNode(index);

    if (node !== null) {
        return node.val;
    }

    return -1;
};

/**
 * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtHead = function(val) {
    var node = new ListNode(val);

    if (this.head !== null) {
        this.head.prev = node;
    }

    node.next = this.head;
    this.head = node;
};

/**
 * Append a node of value val to the last element of the linked list.
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtTail = function(val) {
    var pointer = this.head;
    var node = new ListNode(val);

    if (this.head === null) {
        this.head = node;
        return;
    }

    while (pointer.next !== null) {
        pointer = pointer.next;
    }

    pointer.next = node;
};

/**
 * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
 * @param {number} index
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtIndex = function(index, val) {
    var node = new ListNode(val);
    if (index === 0) {
        this.addAtHead(val);
    }

    var node = this.get(index - 1);
};

/**
 * Delete the index-th node in the linked list, if the index is valid.
 * @param {number} index
 * @return {void}
 */
MyLinkedList.prototype.deleteAtIndex = function(index) {

};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = Object.create(MyLinkedList).createNew()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
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