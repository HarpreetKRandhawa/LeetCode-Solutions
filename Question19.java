//Given a linked list, remove the nth node from the end of list and return its head.
//For example,
   //Given linked list: 1->2->3->4->5, and n = 2.
   //After removing the second node from the end, the linked list becomes 1->2->3->5.
   
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int count = 0;
        while(p!= null){
            count++;
            p = p.next;
        }
        int remove_node = count-n+1;
        p = head;
        if(remove_node == 1){
            return head.next;
        }
        int i = 1;
        while(p != null){
            i++;
            if(i == remove_node){
                p.next = p.next.next;
            }
            p = p.next;
        }
        return head;
    }
}
