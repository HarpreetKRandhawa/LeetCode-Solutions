/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null){
        return head;
    }    
    ListNode parent = head;
    ListNode child = head.next;
    while(child != null){
        if(child.val == parent.val){
            parent.next = child.next;
            child = child.next;
        }
        else{
            parent = child;
            child = child.next;
        }
    }
    return head;
    }
}
