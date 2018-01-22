/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*Approach I: Reverse -> Add 1-> Reverse */
class Solution {
    public ListNode plusOne(ListNode head) {
        if(head == null)
            return null;
        ListNode curr =reverse(head);
        //Add 1
        int carry = 1;
        ListNode temp = curr;
        curr.val += 1;
        while(curr.next != null && curr.val > 9){
            curr.val = 0;
            curr.next.val += 1;
            curr = curr.next;
        }
        if(curr.val > 9){
            curr.val = 0;
            ListNode newNode = new ListNode(1);
            curr.next = newNode;
        }
        ListNode node = reverse(temp);
        return node;
    }
    public ListNode reverse(ListNode head){
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
