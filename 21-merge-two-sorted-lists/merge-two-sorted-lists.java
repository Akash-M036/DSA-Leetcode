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
    public ListNode  mergee(ListNode list1, ListNode list2){
        ListNode list3 =  new ListNode(0,null);
        ListNode head =list3;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
              ListNode ans = new ListNode(list1.val,null);  
            list3.next = ans;
            list3 = ans; 
            list1=list1.next;
            }
            else{
            ListNode ans = new ListNode(list2.val,null);  
            list3.next = ans;
            list3 = ans; 
            list2=list2.next;
            }
        }
        while(list1!=null){
             ListNode ans = new ListNode(list1.val,null);  
            list3.next = ans;
            list3 = ans; 
            list1=list1.next;
        }
        while(list2!=null){
            ListNode ans = new ListNode(list2.val,null);  
            list3.next = ans;
            list3 = ans; 
            list2=list2.next;
        }
        return head.next;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return mergee(list1,list2);
    }
}