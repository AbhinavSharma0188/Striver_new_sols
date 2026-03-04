// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int si=0;
//         int ei=arr.length-1;
//         while(si<=ei){
//             int mid=si+(ei-si)/2;
//             if(arr[mid]-mid-1<k){
//                 si=mid+1;
//             }
//             else{
//                 ei=mid-1;
//             }
//         }
//         return si+k;
        
        
//     }
// }