// public class q143_Search {

//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node head;

//     // Insert at end
//     public void addLast(int val) {
//         Node newNode = new Node(val);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node temp = head;

//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         temp.next = newNode;
//     }

//     // Search element in Linked List
//     public boolean search(int key) {
//         Node temp = head;

//         while (temp != null) {
//             if (temp.data == key) {
//                 return true;
//             }
//             temp = temp.next;
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         q143_Search list = new q143_Search();

//         list.addLast(10);
//         list.addLast(20);
//         list.addLast(30);
//         list.addLast(40);

//         if (list.search(30)) {
//             System.out.println("Element Found");
//         } else {
//             System.out.println("Element Not Found");
//         }
//     }
// }