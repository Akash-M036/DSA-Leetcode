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
        int l =1;
        while(head!=null){
            head= head.next;
            l++;
        }
        return l-1;
    }
         ListNode nh = null;
    public void revk(ListNode head, int k , int l,int times){
        ListNode prev = null;
        ListNode prevprev = null;
        ListNode nxt = null;
        while(head!=null){
            if(times==0) break;
            int x =k;
            ListNode tail = head;
            prev = null;
            while(x!=0 && head!=null){
                nxt = head.next;
                head.next = prev;
              //  prevprev= prev;
                prev= head;
                head= nxt;
                x--;
            }
             if(nh == null) nh = prev;
            if(prevprev!=null) prevprev.next = prev; 
            tail.next=head;
            prevprev = tail;
            times--;
        }
    }
    // 2 1 3 4 5
    // 2 1 4
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int length = len(head);
        int x = length/k;
        revk(head,k,length,x);
        return nh != null ? nh : head;
    }
}