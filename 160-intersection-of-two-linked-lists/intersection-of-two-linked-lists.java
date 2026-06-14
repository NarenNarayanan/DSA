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
    public int length(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode s1=headA;
        ListNode s2=headB;
        int l1=length(headA);
        int l2=length(headB);
        int diff= Math.abs(l1-l2);
        if(l1>l2){
            for(int i=0;i<diff;i++){
                s1=s1.next;
            }
        }
        else{
            for(int i=0;i<diff;i++){
                s2=s2.next;
            }
        }
        if(s1==s2)return s1;
        while(s1!=null && s2!=null){
            s1=s1.next;
            s2=s2.next;
            if(s1==s2)return s1;
        }
        return null;
    }
}