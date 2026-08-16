        class Solution {
            public ListNode swap(ListNode p) {
            ListNode curr = p.next;
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = curr;
            p.next = next;
            return curr;
        }
        public ListNode swapPairs(ListNode head) {
             if (head == null || head.next == null) return head;
                 ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode p = dummy;
            while (p.next != null && p.next.next != null) {
                p = swap(p);
            }
            return dummy.next;
        }
        
        }