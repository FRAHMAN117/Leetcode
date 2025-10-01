/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge= new ListNode();  //node that use to store merged list
        ListNode tail= merge;


        //edge cases- if one or both node is empty
        if (list1==null) return list2;
        if (list2==null) return list1;
        //if everything is null
        if (list1==null && list2==null){
            return merge;
        }

        int list1ptr= 0; //use to keep track of list1's length
        int list2ptr=0; //use to keep track of list2's length

        while(list1 !=null && list2 !=null){
            //check if any value is outside the allowed range
            if (list1.val<-100  || list1.val >100|| list1.val<-100  || list1.val>100){
                break;
            }
            if (list1ptr>50 || list2ptr>50) break;

            if (list1.val< list2.val){
                tail.next= new ListNode(list1.val);
                list1= list1.next;
                tail= tail.next;
                list1ptr++;
            }
            else if (list2.val< list1.val){
                tail.next= new ListNode(list2.val);
                list2= list2.next;
                tail= tail.next;
                list2ptr++;
            }
            else if(list1.val==list2.val){
                tail.next= new ListNode(list1.val);
                tail= tail.next;
                list1= list1.next;
                list1ptr++;
            }
        }

        while(list1 !=null){
            tail.next= new ListNode(list1.val);
            list1= list1.next;
            tail= tail.next;
            list1ptr++;
        }

        while (list2 !=null){
            tail.next= new ListNode(list2.val);
            list2= list2.next;
            tail= tail.next;
            list2ptr++;
        }
        
        return merge.next;
    }
}