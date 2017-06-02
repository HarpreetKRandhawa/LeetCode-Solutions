/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode h2 = reverse(head);
        
        ListNode node = h2;
        while(node != null){
            if(node.val + 1 <= 9){
                node.val = (node.val+1);
                break;
            }
            else{
                node.val = 0;
                if(node.next == null){
                    node.next = new ListNode(1);
                    break;
                }
                node = node.next;
            }
        }
        return reverse(h2);
    }
    
    public ListNode reverse(ListNode h){
        if(h == null || h.next == null)
            return h;
        ListNode l1 = h;
        ListNode l2 = h.next;
        while(l2 != null){
            ListNode l3 = l2.next;
            l2.next = l1;
            l1 = l2;
            l2 = l3;
        }
        h.next = null;
        return l1;
    }
}
