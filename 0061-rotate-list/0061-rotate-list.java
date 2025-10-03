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
        ListNode tail=head;    
        int length=1;
        if (head==null || k==0) return head;
        while (tail.next !=null){
            tail=tail.next;
            length++;
        }
        int r= k % length;
        if (r==0) return head;

        tail.next= head;

        ListNode curr= head;
        for (int i=0; i<length-r-1; i++){
            curr= curr.next;
            //if (r-i==1){
                tail= curr;
            //}
        }
        tail= curr;
        head= tail.next;
        tail.next= null;
        
        return head;
    }
}