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
        while( (head!=null) && (head.next != null)){
            ListNode temp = head.next;
            while(temp!=null && head.val==temp.val){
                temp = temp.next;
            }
            head.next = temp;
            head= head.next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        delete(head);
        return head;
    }
}