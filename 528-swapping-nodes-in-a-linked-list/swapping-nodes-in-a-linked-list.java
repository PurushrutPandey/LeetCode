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
class Solution 
{
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode temp=head;
        int cnt=0;
        while(temp !=null)
        {
            cnt++;
            temp=temp.next;
        }
        int[] arr=new int[cnt];
        int i=0;
        while(head != null)
        {
            arr[i++]=head.val;
            head=head.next;
        }
        int aa=arr[k-1];
        arr[k-1]=arr[cnt-k];
        arr[cnt-k]=aa;
        ListNode dum=new ListNode(0);
        ListNode hh=dum;
        int x=0;
        while(x<cnt)
        {
            ListNode node=new ListNode(arr[x]);
            dum.next=node;
            dum=dum.next;
            x++;
        }
        return hh.next;
    }
}