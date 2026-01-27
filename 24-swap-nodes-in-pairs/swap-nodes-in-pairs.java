/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode dummy=head;
        while(dummy.next!=null){
            int x=dummy.val;
            int y= (dummy.next!=null) ? dummy.next.val : 0;
            dummy.val=y;
            dummy.next.val=x;
            dummy=dummy.next;
            if(dummy.next!=null)dummy=dummy.next;
        }
        return head;
    }
}