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
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int size = list.size();
        if (size == 0) {
            return null;
        }

        // Perform rotation
        k = k % size;
        if (k == 0) {
            return head;
        }

        List<Integer> rotatedList = new ArrayList<>();
        for (int i = size - k; i < size; i++) {
            rotatedList.add(list.get(i));
        }
        for (int i = 0; i < size - k; i++) {
            rotatedList.add(list.get(i));
        }

        // Convert the ArrayList back to linked list
        ListNode dummy = new ListNode(0);
        curr = dummy;
        for (int val : rotatedList) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}