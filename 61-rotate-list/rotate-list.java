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
        int length=0;
        while(head!=null){
            head = head.next;
            length++;
        }
        return length;
    }
    public ListNode rotate(ListNode head , int rot){
        while(rot!=0){
            ListNode temp = head;
            ListNode prev = null;
            while(temp.next!=null){
                prev = temp;
                temp=temp.next;
            }
            temp.next = head;
            prev.next = null;
            head=temp;
            rot--;
        }
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || len(head)==1) return head;
        int l = len(head);
        int rot = k%l;
        return rotate(head,rot);
    }
}