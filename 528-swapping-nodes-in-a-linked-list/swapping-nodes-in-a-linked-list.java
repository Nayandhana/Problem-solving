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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode f=head,s=head;
        for(int i=0;i<k-1;i++)
            fast=fast.next;
            f=fast;
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
        s=slow;
        int temp=f.val;
        f.val=s.val;
        s.val=temp;
        return head;
    }
}