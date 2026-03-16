// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {

//         int count = 0;
//         ListNode temp = head;

//         while (count < k) {
//             if (temp == null) {
//                 return head;
//             }
//             temp = temp.next;
//             count++;
//         }

//         ListNode prevNode = reverseKGroup(temp, k);

//         count = 0;
//         temp = head;

//         while (count < k) {
//             ListNode nextNode = temp.next;
//             temp.next = prevNode;
//             prevNode = temp;
//             temp = nextNode;
//             count++;
//         }

//         return prevNode;
//     }
// }