/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int len(ListNode head){
        if(head==null) return 0;
        int cnt =0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
    // public ListNode rev(ListNode head){
    //     if(head== null || head.next==null)
    //         return;
    //     ListNode prev = head;
    //     head = head.next;
    //     ListNode next = head.next;
    //     while(head!=null){
    //         head.next = prev;
    //         prev = head;
    //         head = next;
    //         next = head.next;
    //     }
    //     return head;
    // }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = len(headA);
        int b = len(headB);
        if(a>b){
            int diff = a-b;
            while(diff!=0){
                headA= headA.next;
                diff--;
            }
        }
        if(b>a){
            int diff = b-a;
            while(diff!=0){
                headB= headB.next;
                diff--;
            }
        }
        while(headA!=headB)
            {
                headA=headA.next;
                headB=headB.next;
            }
            return headA;



    }
}