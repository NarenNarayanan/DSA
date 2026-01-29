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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode list2=slow.next;
        slow.next=null;
        ListNode head2=reverse(list2);
        merge(head,head2);
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void merge(ListNode head1,ListNode head2){
        while(head1!=null && head2!=null){
            ListNode next1=head1.next;
            ListNode next2=head2.next;
            head1.next=head2;
            head2.next=next1;
            head1=next1;
            head2=next2;
        }
    }
}