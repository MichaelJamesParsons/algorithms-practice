class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in * reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int sum;
    int carry = 0;
    ListNode head = new ListNode(0);
    ListNode ptr = head;
    while (l1 != null || l2 != null) {
      sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      ptr.next = new ListNode((sum + carry) % 10);
      ptr = ptr.next;
      carry = (sum + carry) / 10;
    }

    if (carry > 0) {
      ptr.next = new ListNode(carry);
    }

    return head.next;
  }
}
