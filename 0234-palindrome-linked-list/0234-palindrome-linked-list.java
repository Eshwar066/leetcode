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
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (!arr.get(i).equals(arr.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        
        return true; 
    }
}