class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode();
        ListNode res = dum;
        int tot = 0, car = 0;
        while(l1 != null || l2 != null || car != 0){
            tot = car;
            if(l1 != null){
                tot += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                tot += l2.val;
                l2 = l2.next;
            }
            int num = tot % 10;
            car = tot / 10;
            dum.next = new ListNode(num);
            dum = dum.next;
        }
        return res.next;
    }
}