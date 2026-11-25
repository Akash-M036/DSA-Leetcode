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
    public void delete(ListNode head){
        ListNode prev = null;
       while(head!=null){
        while(head!=null && head.next!=null && head.val==head.next.val){
            while(head!=null && head.next!=null && head.val==head.next.val){
                head =head.next;
            }
            head = head.next;
        }
          //  if(head.next!=null && head.val!=head.next.val)
          if(prev!=null)
            prev.next =head;
            prev =head;
            if(head!=null)
            head= head.next;
       }
    }
     public ListNode changehead(ListNode head){
        while(head!=null && head.next!=null && head.val==head.next.val){
             while(head!=null && head.next!=null && head.val==head.next.val){
                head =head.next;
            }
            head =head.next;
        }
      //  if(head==null) return head;
        return head;
     }
    public ListNode deleteDuplicates(ListNode head) {
        if(head!=null && head.next!=null && head.val==head.next.val)
             head = changehead(head);
        delete(head);
        return head;
    }
}