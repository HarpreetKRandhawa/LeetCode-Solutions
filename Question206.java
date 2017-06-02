//Reverse a singly linked list.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode l1 = head;
        ListNode l2 = head.next;
        while(l2 != null){
            ListNode l3 = l2.next;
            l2.next = l1;
            l1 = l2;
            l2 = l3;
        }
        head.next = null;
        return l1;
    }
}
