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
    public ListNode sortList(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
         Integer[] sortedArr = arr.toArray(new Integer[0]);
        Arrays.sort(sortedArr);
       
        ListNode dummy = new ListNode(0);
        curr = dummy;
        for (int val : sortedArr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
       
            
        
    }
}