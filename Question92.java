/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
            return null;
        ListNode curr = new ListNode(0);
        curr.next = head;
        ListNode pre = curr;
        for(int i=1; i<m; i++){
            pre = pre.next;
        }
        ListNode start = pre.next;
        ListNode then = start.next;
        int num = n-m;
        while(num-- > 0){
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return curr.next;
    }
}
