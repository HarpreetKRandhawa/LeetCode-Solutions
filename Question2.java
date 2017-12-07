/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode res = result;
        while(l1 != null || l2 != null){
            int temp = carry;
            carry = 0;
            if(l1 != null){
                temp += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                temp += l2.val;
                l2 = l2.next;
            }
            if(temp > 9){
                carry = temp / 10;
                temp = temp % 10;
            }
            res.next = new ListNode(temp);
            res = res.next;
        }
        if(carry > 0)
            res.next = new ListNode(carry);
        return result.next;
    }
}
