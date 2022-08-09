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
    public ListNode reverseList(ListNode head) {
//         create a new linked list that will be returned
//         create a prev and curr pointer
//         traverse the given list and link the curr to the pointer until list is empty
        System.out.println(head.val);

        if(head == null || head.next == null){
            return head; // 3
        }
        ListNode reversedSublist = reverseList(head.next); //  2
        head.next.next = head; // 2 1
        // System.out.println(reversedSublist.val);
        System.out.println(head.next.next.val);

        head.next = null; //

        return reversedSublist; // 3 2 1


//         ListNode curr = head; // 1
//         ListNode prev = null;

//         while(curr != null){
//             ListNode next = curr.next; // 2 3 4 5 null
//             curr.next = prev; // 5 4 3 2 1
//             prev = curr; // 5
//             curr = next; // null
//         }

//         return prev;

        // if(head == null || head.next == null){
        //     return head;
        // }

//         ListNode curr = head.next; // 2
//         ListNode prev = head; // 1
//         ListNode reverse = new ListNode(prev.val); // use a sentinel node to start the reversed list


//         while(curr != null){
//             prev = curr; // 5
//             curr = curr.next; // null

//             ListNode temp = new ListNode(prev.val); // 5
//             temp.next = reverse; // 5 4 3 2 1
//             reverse = temp; //5 4 3 2 1

//         }
//         return reverse;
    }
}