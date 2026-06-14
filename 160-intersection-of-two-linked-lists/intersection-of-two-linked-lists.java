/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode s1=headA;
        ListNode s2=headB;
        while(s1!=s2){
            s1=(s1==null) ? headB : s1.next;
            s2=(s2==null) ? headA : s2.next;
        }
        return s1;
    }
}