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
    public ListNode createList(ListNode head){
        ListNode ans = new ListNode();
        ListNode temp =ans;
        head =head.next;
        int val =0;
        while(head!=null){
            if(head.val!=0)
                val+=head.val;
            else
                {
                    temp.next = new ListNode();
                    temp = temp.next;
                    temp.val = val;
                    val=0;
                }
                head = head.next;
        }
        return ans.next;
    }
    public ListNode mergeNodes(ListNode head) {
        return createList(head);
    }
}