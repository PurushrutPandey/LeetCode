class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        int n = arr.size();
        for (int i = 0; i < n; i += k) {
            if (n - i < k) break;
            Collections.reverse(arr.subList(i, i + k));
        }
        curr = head;
        for (int i = 0; i < n; i++, curr = curr.next)
            curr.val = arr.get(i);
        return head;
    }
}