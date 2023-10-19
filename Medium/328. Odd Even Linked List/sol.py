'''    
    # LeetCode 328.
    # Problem Statement:
    # Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
    # The first node is considered odd, and the second node is even, and so on.
    # Note that the relative order inside both the even and odd groups should remain as it was in the input.

    # Test Cases:

    # Example 1:
    # Input: head = [1,2,3,4,5]
    # Output: [1,3,5,2,4]

    # Example 2:
    # Input: head = [2,1,3,5,6,4,7]
    # Output: [2,3,6,7,1,5,4]

'''

# Solution:
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy_even = ListNode(0)
        dummy_odd  = ListNode(0)

        even = dummy_even
        odd = dummy_odd

        i = 1

        while(head):
            if i % 2 == 0:
                even.next = head
                even = even.next
            else:
                odd.next = head
                odd = odd.next

            i += 1
            head = head.next

        odd.next = dummy_even.next
        even.next = None

        return dummy_odd.next
