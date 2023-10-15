//Definition for singly-linked list.

public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
 class Solution{
    public ListNode reverseKGroup(ListNode head, int k){
        //Edge cases when list is null or has less than one node
        if(k <= 1 && head == null || head.next == null){
            return head;
        }        
        
        //Start by getting the size of the list
        ListNode temp = head;
        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        //Initialize curr, temp and newhead pointers to have access points while traversing the list
        ListNode curr = head;
        ListNode prev = null;
        ListNode newHead = null;

        //Run a loop to reverse k group. Only get in this group if size is greater than k
        while(size >= k){
            //Initiallize nodes to keep track during reverse process
            ListNode last = prev;
            ListNode newEnd = curr;
            ListNode next = curr.next;

            //loop k times to reverse the k group
            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;

                //Check to move next if it is not equal to null
                if(next != null){
                    next = next.next;
                }
            }

            //Assign last node - node before the the beginning of the next sublist
            if(last != null){
                last.next = prev;
            }else{
                //Assign the newHead with prev
                newHead = prev;
            }
            
            //Point the newEnd to the next node of the main list
            newEnd.next = curr; 

            //Reduce the size of the list by k times to a void a infinite loop
            size -= k;

            //Once the end of a part is done, assign prev with newEnd
            prev = newEnd;
        }
        return newHead;          
    }  
 }

 