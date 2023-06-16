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
    public ListNode insertionSortList(ListNode head) {
        ListNode curr=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(list);
        
        
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int x:list){
            ListNode newNode=new ListNode(x);
            temp.next=newNode;
            temp=temp.next;
        }
        return dummy.next;
        
    }
}