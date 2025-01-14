// time - avg n , worst n^2
// space constant

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        // if(head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while( fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow)
            {
                ListNode slow2 = head;
                while (slow2 != slow)
                {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }

        return null;
    }
}
