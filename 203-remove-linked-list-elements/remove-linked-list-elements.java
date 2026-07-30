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
    public void remove(ListNode head,int value){
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            if(curr.val ==  value){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
            prev = prev.next;
            curr = curr.next;
            }
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        while(head!= null && head.val == val){
            head = head.next;
        }
        if(head!=null)
            remove(head,val);
        return head;
    }
}