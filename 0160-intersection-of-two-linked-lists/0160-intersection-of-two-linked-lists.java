/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode Aptr= headA;
        ListNode Bptr= headB;
        
        while (Aptr != Bptr){
            if (Aptr !=null) Aptr= Aptr.next;
            else Aptr= headB;
            
            if (Bptr !=null) Bptr= Bptr.next;
            else Bptr = headA;
        }

        return Aptr;
    }
}