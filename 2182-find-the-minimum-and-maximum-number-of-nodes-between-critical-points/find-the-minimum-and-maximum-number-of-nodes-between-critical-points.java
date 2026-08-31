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
    int first =-1;
    int last =-1;
    int lprev =-1;
    int diff = Integer.MAX_VALUE;
    public void lmm(ListNode head){
        int prev =-1;
        ListNode next = head.next;
        int i =1;
        while(head !=null){
            next = head.next;
            if(next==null)
                break;
            if(prev==-1){
                prev = head.val;
                head = head.next;
                continue;
            }
            if(head.val<prev && head.val<next.val || head.val>prev && head.val>next.val){
                if(first==-1){
                    first =i;
                }
                lprev = last;
                last = i;
                if(lprev!=-1)
                    diff= Math.min(diff, last-lprev);
            }
            prev = head.val;
            head= head.next;
            i++;
        }
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        //int len = length(head);
        if(head==null || head.next==null) return new int[]{-1,-1};
        lmm( head);
        if(first==last )
            return new int[]{-1,-1};
        return new int[]{diff,last-first};
    }
}