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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next== null)return head;
        ListNode curr=head;
        while(curr.next!=null){
            ListNode temp=curr.next;
            int value=remainder(curr.val,temp.val);
            ListNode newNode=new ListNode(value);
            curr.next=newNode;
            newNode.next=temp;
            curr=temp;
        }
        return head;
    }

    private int remainder(int val1,int val2){
        while(val2!=0){
            int rem = val1%val2;
            val1=val2;
            val2=rem;
        }
        return val1;
    }

}