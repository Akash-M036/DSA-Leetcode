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
    public int len(ListNode head){
        int l=1;
        while(head.next!=null){
            head= head.next;
            l++;
        }
        return l;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int len = len(head);
        if(n>len)   return head;
        if(head.next==null && len==n)   return null;
        int cnt =1;
        ListNode temp =head;
        ListNode prev  = head;
        while(temp!=null && cnt!=len-n+1){
            prev =temp;
            temp = temp.next;
            cnt++;
        }
        if(prev==temp && prev==head)    return head.next;
        prev.next = temp.next;
        return head;
    }
}