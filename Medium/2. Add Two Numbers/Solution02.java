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
        ListNode d=new ListNode(0);
        ListNode t=d;
        int s=0,c=0;
        while(l1!=null || l2!=null){
            s=0;
            if(l1!=null) {
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                s+=l2.val;
                l2=l2.next;
            }
            if(c!=0) s+=c;
            if(s/10!=0){
                ListNode x= new ListNode(s%10);
                t.next=x;
                c=s/10;
                t=x;
            }
            else{
                ListNode x= new ListNode(s);
                t.next=x;
                c=0;
                t=x;
            }  
        }
        if(c!=0){
                ListNode x= new ListNode(c);
                t.next=x;
                t=x;
        }
        return d.next;
    }
}
