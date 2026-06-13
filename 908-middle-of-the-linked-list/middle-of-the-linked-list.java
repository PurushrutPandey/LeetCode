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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode nxt = head;
        while(curr.next!=null && curr.next.next!=null){
            curr = curr.next.next;
            nxt = nxt.next;
        }
        return curr.next != null ? nxt.next:nxt;
    }
}