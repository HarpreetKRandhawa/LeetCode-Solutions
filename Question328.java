//Given a singly linked list, group all odd nodes together followed by the even nodes. 
//Please note here we are talking about the node number and not the value in the nodes.
//You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

//Example:
//Given 1->2->3->4->5->NULL,
//return 1->3->5->2->4->NULL.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;
        ListNode r = head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode connect = head.next;
        while(p1 != null && p2!=null){
            if(p2.next == null)
                break;
            p1.next = p2.next;
            p1 = p1.next;
            
            p2.next = p1.next;
            p2 = p2.next;
        }
        p1.next = connect;
        return r;
    }
}
