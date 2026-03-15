// /*
// class Node {
//     int data;
//     Node next;

//     Node(int d)
//     {
//         data = d;
//         next = null;
//     }
// }*/

// class Solution {
//     public Node segregate(Node head) {
//         // code here
//         int zeroes=0;
//         int ones=0;
//         int twos=0;
//         Node current=head;
//         while(current!=null){
//             if(current.data==0){
//                 zeroes++;
//             }
//             else if(current.data==1){
//                 ones++;
//             }
//             else{
//                 twos++;
//             }
//             current=current.next;
            
//         }
//         Node nhead=new Node(0);
//         current=nhead;
//         for(int i=0;i<=zeroes-1;i++){
//             Node nnode=new Node(0);
//             current.next=nnode;
//             current=current.next;
            
//         }
//         for(int i=0;i<=ones-1;i++){
//             Node nnode=new Node(1);
//             current.next=nnode;
//             current=current.next;
            
//         }
//         for(int i=0;i<=twos-1;i++){
//             Node nnode=new Node(2);
//             current.next=nnode;
//             current=current.next;
            
//         }
//         nhead=nhead.next;
//         return nhead;
        
//     }
// }