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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode next=null;
        ListNode temp=head;
        ListNode prev=null;
        ListNode temp1=slow;
        while(temp1!=null){
            next=temp1.next;
            temp1.next=prev;
            prev=temp1;
            temp1=next;
        }
        int max=0;
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            max=Math.max(max,first.val+second.val);
            first=first.next;
            second=second.next;
        }

        return max;
    }
}