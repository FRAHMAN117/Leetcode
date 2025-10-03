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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result= new ListNode();
        ListNode tail= result;
        ListNode ptr1= l1;
        ListNode ptr2= l2;
        int carry= 0;
        int sum=0;
        while (ptr1 !=null && ptr2 != null){
            sum= (ptr1.val + ptr2.val +carry);
            tail.next= new ListNode(sum % 10);
            carry= sum/10;
            tail= tail.next;
            ptr1= ptr1.next;
            ptr2= ptr2.next;
        }
        while (ptr1 !=null){
            tail.next= new ListNode((ptr1.val + carry) % 10);
            carry= (ptr1.val + carry)/10;
            tail= tail.next;
            ptr1= ptr1.next;
        }
        while (ptr2 !=null){
            tail.next= new ListNode((ptr2.val + carry) % 10);
            carry= (ptr2.val + carry)/10;
            tail= tail.next;
            ptr2= ptr2.next;
        }
        if (carry != 0){
            tail.next= new ListNode(carry);
            tail= tail.next;
        }
        tail.next= null;
        return result.next;
    }
}